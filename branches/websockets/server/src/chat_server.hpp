#include "base_server.hpp"

// A WebSocket server that relays messages to uberserver and back.
// Default port is 8260.
class chat_server : public base_server<chat_server>
{
public:

    chat_server(boost::asio::io_service* service) : m_service(*service), resolver(m_service)
    {
        m_server.init_asio(service);
        m_server.set_open_handler(boost::bind(&chat_server::open_handler, this, _1));
    }
    void listen(uint16_t port)
    {
        m_server.listen(boost::asio::ip::tcp::v4(), port);
        m_server.start_accept();
    }
private:
    void open_handler(websocketpp::connection_hdl hdl)
    {
        // Note that the lambdas capture this by value and can segfault if
        // chat_server is destroyed before io_service::run() finishes (which
        // should never happen). Could've used a shared_ptr for this and
        // disallow creating chat_server on stack, but I'd rather have this
        // comment instead.
        using namespace boost::asio::ip;
        // TODO: resolving can take several seconds, need to cache the result perhaps?.
        resolver.async_resolve({"springrts.com", "8200"}, [=](const error_code& ec, tcp::resolver::iterator it){
            auto socket = std::make_shared<tcp::socket>(m_service);
            async_connect(*socket, it,
                [=](const error_code& ec, tcp::resolver::iterator it){
                    if(it != tcp::resolver::iterator())
                        set_up_tunnel(hdl, socket);
                    else {
                        std::cout << "Could not establish connection to uberserver" << std::endl; // TODO
                        m_server.close(hdl, websocketpp::close::status::internal_endpoint_error, "Uberserver unreachable.");
                    }
            });
        });
    }
    void read_handler(websocketpp::connection_hdl hdl, std::shared_ptr<boost::asio::ip::tcp::socket> socket,
            std::shared_ptr<boost::asio::streambuf> read_buf, const error_code& ec, std::size_t count)
    {
        if(!ec){
            ws_server_type::connection_ptr con;
            try {
                con = m_server.get_con_from_hdl(hdl);
                if(con->get_state() == websocketpp::session::state::open){
                    std::istream is(read_buf.get());
                    std::string msg;
                    std::getline(is, msg);
                    con->send(msg);
                    boost::asio::async_read_until(*socket, *read_buf, '\n',
                        boost::bind(&chat_server::read_handler, this, hdl, socket, read_buf, _1, _2));
                }
                else {
                    socket->close();
                    std::cout << "Closing uberserver connection for " << con->get_remote_endpoint() << std::endl;
                }
            }
            catch(websocketpp::exception e){
                socket->close();
                std::cout << "Client connection dropped, closing uberserver socket. (" << e.what() << ")" << std::endl;
            }
        }
        else {
            std::cout << "Read from uberserver socket failed: " << ec.message() << ", closing connection." << std::endl;
            m_server.close(hdl, websocketpp::close::status::internal_endpoint_error, "Read from server failed.");
        }
    }
    void set_up_tunnel(websocketpp::connection_hdl hdl, std::shared_ptr<boost::asio::ip::tcp::socket> socket)
    {
        auto con = m_server.get_con_from_hdl(hdl);
        std::cout << "Established pass-through connection to uberserver for " << con->get_remote_endpoint() << std::endl;
        auto read_buf = std::make_shared<boost::asio::streambuf>();

        con->set_message_handler([=](websocketpp::connection_hdl hdl, ws_server_type::message_ptr msg){
            if(msg->get_opcode() == websocketpp::frame::opcode::value::text){
                auto send_buf = std::make_shared<std::string>(msg->get_payload());
                *send_buf += "\n";
                boost::asio::async_write(*socket, boost::asio::buffer(*send_buf), [=](const error_code& ec, std::size_t count){
                    auto buf_keep = send_buf; // Keep the shared_ptr to the data until the operation is complete.
                    std::cout << "Write successful, data: " << send_buf << std::endl;
                });
            }
        });

        boost::asio::async_read_until(*socket, *read_buf, '\n',
            boost::bind(&chat_server::read_handler, this, hdl, socket, read_buf, _1, _2));
    }

    boost::asio::io_service& m_service;
    boost::asio::ip::tcp::resolver resolver;
};

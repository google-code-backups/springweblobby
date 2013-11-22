#include <iostream>

#include "chat_server.hpp"

// TODO: keep logs in ~/.spring/weblobby-server.log and gzip and timestamp them once > 1 Mb

// A WebSocket server that gives access to unitsync and other utilities.
// Default port is 8460.
class unitsync_server {};

int main(int argc, char* argv[])
{
    boost::asio::io_service service;
    chat_server chat(&service);
    chat.listen(8260);
    /*ws_server test_server;
    test_server.init_asio(&service);
    test_server.set_message_handler([&](websocketpp::connection_hdl hdl, ws_server::message_ptr msg){
        std::cout << "Message recieved: " << msg->get_payload() << std::endl;
        auto con = test_server.get_con_from_hdl(hdl);
        std::cout << "From: " << con->get_remote_endpoint() << (con->get_socket().remote_endpoint().address().is_loopback() ? " (loopback)" : "") << std::endl;
    });
    test_server.listen(boost::asio::ip::tcp::v4(), 9002);
    test_server.start_accept();*/

    bool should_run = true;
    while(should_run){
        try {
            service.run();
            should_run = false;
        }
        catch(boost::system::error_code e){
            std::cout << "Caught boost::system::error_code, " << e.message() << std::endl;
        }
    }
    return 0;
}

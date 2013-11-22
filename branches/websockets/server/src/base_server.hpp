#include <boost/asio.hpp>

#include <websocketpp/config/asio_no_tls.hpp>
#include <websocketpp/server.hpp>

template<typename derived>
class base_server
{
public:
    typedef websocketpp::server<websocketpp::config::asio> ws_server_type;
    typedef boost::system::error_code error_code;

protected:
    ws_server_type m_server;
};

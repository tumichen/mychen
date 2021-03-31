package rabbitmq.util;

import com.rabbitmq.client.ConnectionFactory;

public class ConnectionFactionUtil {
    public static ConnectionFactory getConnectionFaction(){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.144.135");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        return factory;
    }
}

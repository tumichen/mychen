package rabbitmq.simple;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;

public class consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.144.135");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("helloworld", false, false, false, null);
        System.out.println("等待接收数据");
        //函数式接口,,可用lambda表达式
        DeliverCallback callback = (consumerTag, message) -> {
            String msg = new String(message.getBody(), "UTF-8");
            System.out.println("收到" + msg);
        };
        //消费者取消时的回调对象
        CancelCallback cancelback = (consumerTag) -> {};
        channel.basicConsume("helloworld", true, callback, cancelback);
    }
}

package rabbitmq.topic;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import rabbitmq.util.ConnectionFactionUtil;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class provide {

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = ConnectionFactionUtil.getConnectionFaction();

        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();
        channel.exchangeDeclare("topic_logs", BuiltinExchangeType.TOPIC);
        while (true) {
            //控制台输入的消息发送到rabbitmq
            System.out.print("输入消息: ");
            String msg = new Scanner(System.in).nextLine();
            //如果输入的是"exit"则结束生产者进程
            if ("exit".equals(msg)) {
                break;
            }
            System.out.print("输入routingKey: ");
            String routingKey = new Scanner(System.in).nextLine();
            //参数:exchage,routingKey,props,body
            // -props: 消息是否持久化
            System.out.println("我是:"+routingKey);
            channel.basicPublish("topic_logs", routingKey, null, msg.getBytes());
            System.out.println("消息已发送: "+msg);
        }
        channel.close();
    }
}

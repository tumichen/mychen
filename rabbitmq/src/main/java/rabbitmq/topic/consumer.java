package rabbitmq.topic;

import com.rabbitmq.client.*;
import rabbitmq.util.ConnectionFactionUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = ConnectionFactionUtil.getConnectionFaction();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("topic_logs", BuiltinExchangeType.TOPIC);
        //自动生成对列名,
        //非持久,独占,自动删除
        String queueName = channel.queueDeclare().getQueue();
        System.out.println("输入bindingKey,用空格隔开:");
        String[] a = new Scanner(System.in).nextLine().split("\\s");
        for (String bindingKey : a) {
            channel.queueBind(queueName, "topic_logs", bindingKey);
        }
        System.out.println("等待接收数据");

        DeliverCallback callback = (consumerTag, message) -> {
            String msg = new String(message.getBody(), "UTF-8");
            System.out.println("收到" + msg);
            System.out.println("处理结束");
        };
        //消费者取消时的回调对象
        CancelCallback cancelback = (consumerTag) -> {
        };
        channel.basicConsume(queueName, true, callback, cancelback);
    }
}

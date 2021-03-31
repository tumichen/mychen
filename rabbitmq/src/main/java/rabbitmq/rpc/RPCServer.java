package rabbitmq.rpc;

import com.rabbitmq.client.*;
import rabbitmq.util.ConnectionFactionUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RPCServer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = ConnectionFactionUtil.getConnectionFaction();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("rpc_queue", false, false, false, null);
        channel.queuePurge("rpc_queue");
        channel.basicQos(1);
        DeliverCallback callback = (consumerTag, message) -> {
            String msg = new String(message.getBody(), "UTF-8");
            int r = Integer.parseInt(msg);
            int i = fbnq(r);
            String response = String.valueOf(i);
            //设置发回响应的id
            AMQP.BasicProperties replyProps = new AMQP.BasicProperties().builder().correlationId(message.getProperties().getCorrelationId()).build();
            channel.basicPublish("", message.getProperties().getReplyTo(), replyProps, response.getBytes("UTF-8"));
            channel.basicAck(message.getEnvelope().getDeliveryTag(), false);
        };
        CancelCallback cancelCallback = consumerTag -> {
        };
        //消费者开始接收消息, 等待从 rpc_queue接收请求消息, 不自动确认
        channel.basicConsume("rpc_queue", false, callback, cancelCallback);
    }

    protected static int fbnq(int n) {
        if (n == 1 || n == 2) return 1;
        return fbnq(n - 1) + fbnq(n - 2);
    }
}

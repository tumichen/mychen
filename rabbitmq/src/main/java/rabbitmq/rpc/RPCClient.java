package rabbitmq.rpc;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class RPCClient {
    Connection con;
    Channel ch;

    public RPCClient() throws Exception {
        ConnectionFactory f = new ConnectionFactory();
        f.setHost("192.168.144.135");
        f.setPort(5672);
        f.setUsername("admin");
        f.setPassword("admin");
        con = f.newConnection();
        ch = con.createChannel();
    }

    public String call(String msg) throws IOException, InterruptedException {
        String queueName = ch.queueDeclare().getQueue();
        String corrId = UUID.randomUUID().toString();
        AMQP.BasicProperties props = new AMQP.BasicProperties().builder().correlationId(corrId).replyTo(queueName).build();
        ch.basicPublish("", "rpc_queue", props, msg.getBytes("UTF-8"));
        ArrayBlockingQueue<String> response = new ArrayBlockingQueue<>(1);
        DeliverCallback deliverCallback = ((consumerTag, message) -> {
            if (message.getProperties().getCorrelationId().contentEquals(corrId)) {
                response.offer(new String(message.getBody(), "UTF-8"));
            }
        });

        CancelCallback cancelCallback = (consumerTag -> {
        });
        ch.basicConsume(queueName, true, deliverCallback, cancelCallback);
        return response.take();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("wocaocao");
        RPCClient client = new RPCClient();
        while (true){
            System.out.println("求第几个斐波那契数");
            int a = new Scanner(System.in).nextInt();
            String response = client.call(String.valueOf(a));
            System.out.println(response);
        }
    }
}

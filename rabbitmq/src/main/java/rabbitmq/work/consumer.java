package rabbitmq.work;

import com.rabbitmq.client.*;
import rabbitmq.util.ConnectionFactionUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class consumer {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = ConnectionFactionUtil.getConnectionFaction();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("task_queue", true, false, false, null);
        System.out.println("等待接收数据");
        channel.basicQos(1); //一次只接收一条消息
        //函数式接口,,可用lambda表达式
        DeliverCallback callback = (consumerTag, message) -> {
            String msg = new String(message.getBody(), "UTF-8");
            System.out.println("收到" + msg);

            //遍历字符串中的字符,每个点使进程暂停一秒
            for (int i = 0; i < msg.length(); i++) {
                if (msg.charAt(i)=='.') {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
            System.out.println("处理结束");
            channel.basicAck(message.getEnvelope().getDeliveryTag(),false);
        };
        //消费者取消时的回调对象
        CancelCallback cancelback = (consumerTag) -> {
        };
        channel.basicConsume("task_queue", false, callback, cancelback);
    }
}

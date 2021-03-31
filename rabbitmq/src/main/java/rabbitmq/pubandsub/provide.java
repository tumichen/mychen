package rabbitmq.pubandsub;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import rabbitmq.util.ConnectionFactionUtil;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class provide {

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory factory = ConnectionFactionUtil.getConnectionFaction();

        Connection connection = factory.newConnection();

        Channel channel = connection.createChannel();
        //定义名字为logs的交换机,交换机类型为fanout
        //这一步是必须的，因为禁止发布到不存在的交换。
        channel.exchangeDeclare("logs","fanout");
        /*
         * 发布消息
         * 这里把消息向默认交换机发送.
         * 默认交换机隐含与所有队列绑定,routing key即为队列名称
         *
         * 参数含义:
         * 	-exchange: 交换机名称,空串表示默认交换机"(AMQP default)",不能用 null
         * 	-routingKey: 对于默认交换机,路由键就是目标队列名称
         * 	-props: 其他参数,例如头信息
         * 	-body: 消息内容byte[]数组
         */
        while (true) {
            //控制台输入的消息发送到rabbitmq
            System.out.print("输入消息: ");
            String msg = new Scanner(System.in).nextLine();
            //如果输入的是"exit"则结束生产者进程
            if ("exit".equals(msg)) {
                break;
            }
            //参数:exchage,routingKey,props,body
            // -props: 消息是否持久化
            channel.basicPublish("logs", "", null, msg.getBytes());
            System.out.println("消息已发送: "+msg);
        }
        channel.close();
    }
}

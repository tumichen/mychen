package Arrays;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread02 {
    static BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(5);
    static ThreadPoolExecutor tpool = new ThreadPoolExecutor(3,
            5,
            30, TimeUnit.SECONDS, workQueue);
    static void doTask(int i){
        tpool.execute(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name+"execute task"+i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        doTask(1);
        doTask(2);
        doTask(3);
        doTask(4);
        doTask(5);
    }
}

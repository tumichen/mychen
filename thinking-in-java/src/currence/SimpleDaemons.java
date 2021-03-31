package currence;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+":"+this);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("sleep() interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
        daemon.setDaemon(true);
        daemon.start();
    }
        System.out.println("All Daemon started");
        TimeUnit.MILLISECONDS.sleep(100);
    }
}

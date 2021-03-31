package currence;

import java.util.concurrent.ThreadFactory;

public class DaemonThteadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}

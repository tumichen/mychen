package currence;

import java.util.ArrayList;
import java.util.concurrent.*;

class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+id;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> stringFuture = exec.submit(new TaskWithResult(i));
            results.add(stringFuture);
        }
        for (Future<String> fs:results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}

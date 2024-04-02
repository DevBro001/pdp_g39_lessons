package src.scheduledThreadPool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        Runnable task = ()->{
            System.out.println(Thread.currentThread() +" "+ new Date());
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        System.out.println(new Date());
        scheduledExecutorService.execute(task);

        /*
        for (int i = 0; i < 15; i++) {
            int finalI = i;
            Runnable task = ()->{
            System.out.println(Thread.currentThread() +" Task number => " + finalI +"  count of threads"+ Thread.activeCount());
            };
            scheduledExecutorService.execute(task);
        }
*/
    }
}

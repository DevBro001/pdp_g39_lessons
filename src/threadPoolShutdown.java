package src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class threadPoolShutdown {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable task = ()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println(Thread.currentThread() +" Task number => " + finalI);
            };
            executorService.execute(task);
        }
        executorService.shutdown();
        if (!executorService.awaitTermination(1, TimeUnit.SECONDS)){
            executorService.shutdownNow();
        }


    }
}

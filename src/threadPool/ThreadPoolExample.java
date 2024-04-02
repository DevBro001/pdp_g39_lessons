package src.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable task = ()->{
                System.out.println(Thread.currentThread() +" Task number => " + finalI);
            };
            executorService.execute(task);
        }
*/
        /*ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable checkHumo = ()->{
            System.out.println("Humo is checking");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            System.out.println("Humo checking is done");

        };
        Runnable checkUzcard = ()->{
            System.out.println("Uzcard is checking");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("Uzcard checking is done");
        };
        executorService.execute(checkUzcard);
        executorService.execute(checkHumo);
*/


      /*  ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable task = ()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread() +" Task number => " + finalI);
            };
            executorService.execute(task);
        }
*/
      /*  int countOfProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(countOfProcessors);
        ExecutorService executorService = Executors.newFixedThreadPool(countOfProcessors);

        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable task = ()->{
              *//*  try {
//                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*//*
                System.out.println(Thread.currentThread() +" Task number => " + finalI +"  count of threads"+ Thread.activeCount());
            };
            executorService.execute(task);
        }
*/
        Thread[] threads = new Thread[2];
        Thread.enumerate(threads);
        for (Thread thread : threads) {
            System.out.println(thread);
            System.out.println(thread.isDaemon());
        }

    }
}

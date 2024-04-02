package src.threadLocalExample;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

    public static void main(String[] args) throws InterruptedException {
        RandomArray randomArray = new RandomArray();

        Runnable runnable = () -> {
            int[] arr = new int[30];
            randomArray.fillArray(arr, 10, 30);

        };

        try(ExecutorService executorService = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 100; i++) {
                executorService.submit(runnable);
            }
        }
        Thread.sleep(1000);

        System.out.println(randomArray.set.size());

    }
}

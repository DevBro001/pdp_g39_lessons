package src.callableandFutureExamples;

import java.util.concurrent.*;

public class CallableAndFutureExamples {
    public static void main(String[] args) throws InterruptedException {


        Callable<Boolean> taskUzcard = ()-> {
            System.out.println("Uzcard is checking________");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Uzcard checked________");

            return true;
        };
        Callable<Boolean> taskHumo = ()-> {
            System.out.println("Humo is checking________");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Humo checked________");

            return true;
        };

        int i = Runtime.getRuntime().availableProcessors();
        long start = System.currentTimeMillis();

        try(ExecutorService executorService = Executors.newFixedThreadPool(i)) {
            Future<Boolean> uzcardResult = executorService.submit(taskUzcard);
            Future<Boolean> humoResult = executorService.submit(taskHumo);

            System.out.println("Uzcard result :"+uzcardResult.get());
            System.out.println("Humo result :"+humoResult.get());

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}

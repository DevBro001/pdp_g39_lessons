package src.futureMethodsExample;

import java.util.List;
import java.util.concurrent.*;

public class FutureInvokeExample {

    public static void main(String[] args) {
        Callable<String> task1 = ()->{
            System.out.println("Taks 1 run");
            TimeUnit.MILLISECONDS.sleep(200);
            return "result 1";
        };
        Callable<String> task2 = ()->{
            System.out.println("Taks 2 run");
            TimeUnit.MILLISECONDS.sleep(200);
            return "result 2";
        };
        Callable<String> task3 = ()->{
            System.out.println("Taks 3 run");
            TimeUnit.MILLISECONDS.sleep(200);
            return "result 3";
        };

        try (ExecutorService executorService =
                     Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())){
            List<Callable<String>> tasksList = List.of(task3,task1,task2);
            String result = executorService.invokeAny(tasksList);
            System.out.println(result);
            /*
            List<Future<String>> futures = executorService.invokeAll(tasksList);
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
            */

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

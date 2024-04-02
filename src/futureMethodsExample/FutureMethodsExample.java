package src.futureMethodsExample;

import java.util.concurrent.*;

public class FutureMethodsExample {
    public static void main(String[] args) {

        Callable<String> weatherInfo = ()->{
            System.out.println("Getting weather info");
            // request to Weather WebSite

            TimeUnit.SECONDS.sleep(5);
            return "Weather is running";
        };

        try (ExecutorService executorService =
                     Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())){
            Future<String> todayWeather = executorService.submit(weatherInfo);

            System.out.println(todayWeather.get(3, TimeUnit.SECONDS));



            /*TimeUnit.SECONDS.sleep(3);
            boolean isDone = todayWeather.isDone();

            if (!isDone){
                todayWeather.cancel(true);
            }

            if (!todayWeather.isCancelled()){
                System.out.println(todayWeather.get());
            }else {
                System.out.println("Your task canceled");
            }
*/

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            System.out.println("Your request`s time is out");
        }


    }
}

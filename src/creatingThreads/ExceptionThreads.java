package src.creatingThreads;

public class ExceptionThreads {
    public static void main(String[] args) throws InterruptedException {

        Runnable task =()-> {

            Thread thread = Thread.currentThread();
            for (int i = 0; i < 15; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(thread + " Thread is interrupted");
                    }
                    System.out.println(thread +" "+i);

            }
        };


        Thread thread = new Thread(task, "My th1");
        Thread thread1 = new Thread(task, "My th2");

        thread.start();
        thread1.start();

        Thread.sleep(500);

        System.out.println("salom");
    }
}

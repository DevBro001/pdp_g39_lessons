package src.creatingThreads;

public class CreatingThread {
    public static void main(String[] args) throws InterruptedException {
   /*     for (int i = 0; i < 100000; i++) {
            MyThread myThread1 = new MyThread("My first thread " + i);
            myThread1.start();
        }
*/
        Runnable task = ()->{
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 100000; i++) {
//                System.out.println(name + ":" + i);
            }
        };

      /*  Thread thread1 = new Thread(task,"My 1");
        // NEW
        Thread.State state1 = thread1.getState();
        System.out.println(state1);


        thread1.start();

        Thread.State state = thread1.getState();
        System.out.println(state);

        thread1.join();

        // Terminate
        Thread.State state2 = thread1.getState();
        System.out.println(state2);

        System.out.println("Salom dunyo");*/

    }
}


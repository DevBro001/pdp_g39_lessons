package src.creatingThreads;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+" -> "+i);
        }


    }
}

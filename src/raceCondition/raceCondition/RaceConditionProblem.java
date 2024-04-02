package src.raceCondition.raceCondition;

public class RaceConditionProblem {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100);

        Runnable task = ()->{
            for (int i = 0; i < 1000; i++) {
                account.addBalance(10);
            }
            String name = Thread.currentThread().getName();
            System.out.println(name);
        };

        for (int i = 0; i < 10; i++) {
            new Thread(task,"Thread "+i).start();
        }

        Thread.sleep(2000);
        System.out.println(account.getBalance());


    }
}

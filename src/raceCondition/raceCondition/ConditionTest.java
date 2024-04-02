package src.raceCondition.raceCondition;

import src.raceCondition.condition.Account;

public class ConditionTest {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(100);
        Runnable task1 = ()->{
            String name = Thread.currentThread().getName();
            System.out.println(name+": start");
            account.minusBalance(150);
            System.out.println(name+": stop");
        };

        new Thread(task1,"Th1").start();
        Thread.sleep(1000);
        account.addBalance(10);

        System.out.println(account.getBalance());
    }
}

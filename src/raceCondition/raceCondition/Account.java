package src.raceCondition.raceCondition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private Integer balance;
    private Lock lock = new ReentrantLock();
    public Account(int balance) {
        this.balance = balance;
    }
    public void addBalance(int sum){
        System.out.println("start");
        synchronized (this){
            int i = balance + sum;
            balance = i;
        }
        System.out.println("end");

    }


    public int getBalance() {
        return balance;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }
}

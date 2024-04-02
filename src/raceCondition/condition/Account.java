package src.raceCondition.condition;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account  {
    private int balance;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public Account(int balance) {
        this.balance = balance;
    }
    public void addBalance(int sum){
        lock.lock();
        int i = balance + sum;
        balance = i;
        String name = Thread.currentThread().getName();
        System.out.println(name + " NotifyAll");
        condition.signalAll();
        lock.unlock();
    }

    public void minusBalance(int sum){
       lock.lock();
       while (balance<sum) {
           try {
               String name = Thread.currentThread().getName();
               System.out.println(name + " WAIT");
               condition.await();
               System.out.println(name + " RUN");
           } catch (InterruptedException e) {
           }
       }
        balance -=sum;
        lock.unlock();

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

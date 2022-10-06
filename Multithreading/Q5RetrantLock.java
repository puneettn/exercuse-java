package Multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Q5RetrantLock {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Q5RetrantLock Example = new Q5RetrantLock();
        new Thread(() -> {
            Example.lock.lock();
            System.out.println("Lock Thread 1");
            try {
                Thread.sleep(5000);
                Example.condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread running");
            Example.lock.unlock();
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Example.lock.lock();
            System.out.println("Lock Thread 2");
            Example.condition.signal();
            System.out.println("Thread finished working");
            Example.lock.unlock();
        }).start();
    }
}
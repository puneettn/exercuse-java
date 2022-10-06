package Multithreading;

public class Question_1 {
    //1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new ThreadRunnableClass());
        Thread t2 = new ThreadClass();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}

class ThreadRunnableClass implements Runnable {

    @Override
    public void run() {
        System.out.println("In Thread Runnable class");
    }
}

class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("In thread class");
    }
}
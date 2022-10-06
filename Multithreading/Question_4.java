package Multithreading;

import java.util.concurrent.*;

class RunableI implements Runnable {
    public void run() {
        System.out.println("Ruunable ");
    }
}

class CallableI implements Callable {

    @Override
    public Integer call() throws Exception {
        return 5;
    }
}


public class Question_4 {
    static ExecutorService ex = Executors.newFixedThreadPool(2);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunableI t1 = new RunableI();
        Thread th = new Thread(t1);
//        CallableI c1 = new CallableI();    /for Callable
//        Future<Integer> num = ex.submit(c1);
//        System.out.println(num.get());
        th.start();
        ex.submit(th);


    }
}
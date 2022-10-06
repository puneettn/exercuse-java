package Multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question2{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//          ExecutorService executorService=Executors.newCachedThreadPool();
        for (int i = 0; i < 50; i++) {
            executorService.submit(() -> {
                System.out.println("Submitting to Executors");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(5, TimeUnit.DAYS);
            System.out.println(".Here Shutdown");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
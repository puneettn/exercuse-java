package Java_8;

public class Question_3 {

    public static void main(String[] args) {
        new Thread(()-> {System.out.println("Thread ::"+Thread.currentThread().getId()+" "+Thread.currentThread());}).start();
        System.out.println();

    }
}
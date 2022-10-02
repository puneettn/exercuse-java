package Java_9_17;

import java.util.stream.IntStream;

public class Question_3 {
    //Use rangeClosed to create a  Stream
    public static void main(String[] args) {

        IntStream.rangeClosed(1,20)
                .forEach(System.out::println);
    }
}
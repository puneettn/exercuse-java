package Java_9_17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question_2 {
    //Perform takeWhile and dropWhile operations on stream
    public static void main(String[] args) {

        System.out.println(IntStream
                .rangeClosed(1,10)
                .takeWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));


        System.out.println(IntStream
                .rangeClosed(1,15)
                .dropWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));


    }
}
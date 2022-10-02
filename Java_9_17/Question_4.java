package Java_9_17;

import java.util.stream.IntStream;

public class Question_4 {
    //Use iterator stream method to generate a stream

    public static void main(String[] args) {

        IntStream
                .iterate(0,i->i<=10,i->i+2)
                .forEach(System.out::println);
    }
}
package Java_9_17;

import java.util.Arrays;
import java.util.List;

public class Question_6 {
    //Convert an Optional type into Stream
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 3, 2, 5, 6, 7, 8, 9);

                 list
                .stream()
                .filter(integer -> integer > 7)
                .findFirst()
                .stream();
    }
}
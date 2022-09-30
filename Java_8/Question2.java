package Java_8;
import java.util.function.BiFunction;
public class Question2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return b - a;
    }


    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> ad = Question2::add;
        System.out.println(ad.apply(2, 3));
        BiFunction<Integer, Integer, Integer> sub = Question2::subtract;
        System.out.println(sub.apply(4, 7));

    }
}

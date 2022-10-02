package Java_9_17;

sealed class Base permits Child1, Child2 {
};

final class Child1 extends Base {
};

sealed class Child2 extends Base permits Child3 {
};

non-sealed class Child3 extends Child2 {
};

public class Question_12 {
    //Demonstrate the use of Sealed Classes.
    public static void main(String[] args) {

    }
}
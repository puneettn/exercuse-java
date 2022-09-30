package Java_8;


interface Interface_1 {
    default void display() {
        System.out.println("Interface_1");
    }
}

interface Interface_2 {

    default void display() {
        System.out.println("Interface_2");
    }
}

interface Interface_3 extends Interface_1, Interface_2 {
    default void display() {
        Interface_2.super.display();
        System.out.println("Interface_3");
    }

}

public class Question_5 implements Interface_3 {
    public void display() {
        Interface_3.super.display();
        System.out.println("Default Class_Method_Display");
    }

    public static void main(String[] args) {
        new Question_5().display();
    }
}
package Java_9_17;

record Student(String name, Integer id, Integer age) {
    static int counter = 0;
    static void incrementCounter() {
        counter++;
    }
    Student {
        incrementCounter();
    }
}
public class Question_11 {
    public static void main(String[] args) {
        Student student1 = new Student("sal", 21, 24);
        Student student2 = new Student("raj", 23, 22);

        System.out.println(student2.equals(student1));

        System.out.println(Student.counter);
    }
}
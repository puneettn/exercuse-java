package Java_9_17;

public class Question_1 {

    interface StringManipulation{
        private static String reverse(String string){
            return new StringBuilder(string).reverse().toString();
        }

        static String toLowerReverse(String string){
            return reverse(string).toLowerCase();
        }

        static String toUpperReverse(String string){
            return reverse(string).toUpperCase();
        }
    }

    //Demonstrate the use of private methods in interfaces

    public static void main(String[] args) {

        System.out.println(StringManipulation.toUpperReverse("Puneet"));
        System.out.println(StringManipulation.toLowerReverse("Kataria"));

    }
}
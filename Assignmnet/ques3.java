import java.util.Scanner;

public class ques3 {
    public static void Area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        Double area = Math.PI * r * r;
        System.out.println("Area of Circle :" + area);
    }
    public static void Circum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int r = sc.nextInt();
        Double circum = (2 * Math.PI * r);
        System.out.println("Circum of Circle  " + circum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                Area();
                break;
            case 2:
                Circum();
                break;
            case 3:
                System.out.println("bye");
                System.exit(0);
            default:
                System.out.println("Not Eligible");
        }
    }
}

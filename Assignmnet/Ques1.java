
/*
class Details() {

}
  */
public class Ques1 {
       static String Firstname = "Puneet";
       static String Lastname = "Kataria" ;
       static int age = 20 ;
 static {
     System.out.print("In static block" + " ");
     System.out.println(Firstname + " " + Lastname + " " + age);
 }
 public static void print () {
     age = age+3 ;
     System.out.print("In the Static function " );
     System.out.println(Firstname + " " + Lastname + " " + age);
 }

    public static void main(String[] args) {
        System.out.print("Through Static Variable" + " ");
        System.out.println(Firstname + " " + Lastname + " " + age);
        print();
    }
}

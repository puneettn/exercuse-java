import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "" ;
        String str1 = "";
        while (!"xdone".equals(str = scn.nextLine())) {
            str1+= str +" " ;
        }
        System.out.println(str1);
    }
}
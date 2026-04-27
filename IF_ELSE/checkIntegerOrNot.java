
// This code is to check whether the number entered by the user is an integer or not.
import java.util.Scanner;

public class checkIntegerOrNot {
        static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        double n=sc.nextDouble();
        int x=(int)n;// this is to convert the double value to integer value. If the number is an integer then the value of n and x will be same, otherwise the value of n will be greater than x.
        if(n-x>0) System.out.println("not a integer");
        else System.out.println("is integer");
    }
}

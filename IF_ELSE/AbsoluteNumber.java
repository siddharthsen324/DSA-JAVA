// Write a program to find the absolute value of a number entered by the user.
import java.util.Scanner;

public class AbsoluteNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int x=sc.nextInt();
        if (x>=0) System.out.println(x);
        else System.out.println(-x);
    }
}
    //the algorithm is this code is to find the absolute value of a number entered by the user. 
    // We can use if-else statement to check whether the number is positive or negative. 
    // If the number is positive then we can print the number as it is,
    // otherwise we can print the negative of the number to get the absolute value.
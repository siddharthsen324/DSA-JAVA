//This program calculates the square of a number entered by the user.
import java.util.Scanner;//importing the Scanner class to take input from the user

public class SquareNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        double r=Sc.nextDouble();//nextDouble() method is used to read a double value from the user
        double s=r*r;
        System.out.print("The square is :");
        System.out.println(s);
    }
}
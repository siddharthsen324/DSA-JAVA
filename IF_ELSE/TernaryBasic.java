import java.util.Scanner;
public class TernaryBasic {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        // Check even or odd using ternary operator (condition ? true : false)
        System.out.println((x%2==0) ? "even":"odd");
    }
}



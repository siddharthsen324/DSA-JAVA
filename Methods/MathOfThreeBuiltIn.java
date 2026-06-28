import java.util.Scanner;

public class MathOfThreeBuiltIn {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}

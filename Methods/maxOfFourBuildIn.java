import java.util.Scanner;

public class maxOfFourBuildIn {
     static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}

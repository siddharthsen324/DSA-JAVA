import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)

     {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int fact =1;
        int i;
         for( i=1;i<=x;i++){
             fact*=i;
        }
        System.out.println(fact);
    }
}

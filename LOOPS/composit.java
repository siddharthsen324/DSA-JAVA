import java.util.Scanner;
// the composite number is the number which has more than 2 factors
public class composit {
        static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        boolean flag=true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (n==1) System.out.println(" neither prime nor composite");
        else if (flag==false) System.out.println("the number is composite");
        else System.out.println("the number is prime");
    }
 }



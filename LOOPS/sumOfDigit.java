import java.util.Scanner;
// sum of digit of a number
public class sumOfDigit {
    static void main(String[] args) {
        System.out.print("enter the number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        int count=0;
        while (n!=0){
            r=n%10;
            n/=10;
            count+=r;
        }
        System.out.println("sum of digit "+((count>0) ? count:-count));

    }
}
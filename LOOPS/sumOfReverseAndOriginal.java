import java.util.Scanner;

public class sumOfReverseAndOriginal {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the reverse number :");
        int x=sc.nextInt();
        int a=x;
        int r=0;
        while(x!=0){
            r*=10;
            r+=(x%10);
            x/=10;

        }
        int ans=a+r;
        System.out.println("revers number sum :"+ans);
    }
}
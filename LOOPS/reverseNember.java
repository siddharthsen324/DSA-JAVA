import java.util.Scanner;

public class reverseNember {
        static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the reverse number :");
        int x=sc.nextInt();
        int r=0;
        while(x!=0){
            r*=10;
            r+=(x%10);
            x/=10;

        }
        System.out.println("revers number :"+r);
    }
}

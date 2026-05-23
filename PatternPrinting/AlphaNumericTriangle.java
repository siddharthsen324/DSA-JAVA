// this code is for printing the alpha numeric triangle pattern
import java.util.Scanner;
public class AlphaNumericTriangle {
        static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if(i%2==0) System.out.print((char)(64+j)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


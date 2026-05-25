import java.util.Scanner;
// this code is for printing the alphabet square pattern
public class Alphabet_Square2 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}

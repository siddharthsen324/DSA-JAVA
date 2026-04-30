import java.util.Scanner;
public class GreaterOfThree {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 3 numbers input
        System.out.print("enter the 1st number :");
        int a=sc.nextInt();
        System.out.print("enter the 2nd number :");
        int b=sc.nextInt();
        System.out.print("enter the 3rd number :");
        int c=sc.nextInt();

        // Main logic:
        // Pehle a vs b compare
        // Jo bada hai usko c se compare karke greatest find

        if(a>=b){
            if(a>=c) System.out.println(a);  // a sabse bada
            else System.out.println(c);     // c sabse bada
        }else {
            if(b>=c) System.out.println(b); // b sabse bada
            else System.out.println(c);     // c sabse bada
        }

        // Time Complexity: O(1)  (fixed comparisons)
        // Space Complexity: O(1)
    }
}


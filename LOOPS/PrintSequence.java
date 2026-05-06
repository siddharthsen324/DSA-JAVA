import java.util.*;
/*
    Question:
    Write a Java program to print a sequence in the following pattern:
    
    Input: n
    Output:
    1
    n
    2
    n-1
    3
    n-2
    ...

    The sequence alternates between the smallest remaining number 
    and the largest remaining number until all numbers are printed.

    Example:
    Input: 5
    Output:
    1 5 2 4 3
*/
public class PrintSequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n=sc.nextInt();

        int start=1;
        int end = n;
        for (int i = 1; i<=n ; i++){
            if(i%2==1) {
                System.out.println(start);
                start++;
            }
            else {
                System.out.println(end);

                end--;
            }
        }
    }
}



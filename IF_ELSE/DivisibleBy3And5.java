//Write a program to check whether a number is divisible by 3 and 5 or not.
//then print Riya if the number is divisible by both 3 and 5, print Ranu if the number is divisible by 3 but not 5, 
// print Apurva if the number is divisible by 5 but not 3, 
// and print Isha if the number is not divisible by either 3 or 5.

import java.util.Scanner;

public class DivisibleBy3And5 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :");

        int x = sc.nextInt();
        if(x%5==0 && x%3==0){
            System.out.println("Riya");
        } else if (x%3==0) {
            System.out.println("Ranu");
        } else if (x%5==0) {
            System.out.println("Apurva");
        }else {
            System.out.println("Isha");
        }
    }
}

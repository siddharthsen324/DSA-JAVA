import java.util.Scanner;
/*
    Question:
    Write a Java program to print uppercase English alphabets 
    along with their corresponding ASCII values.
*/

public class Ascii {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for (int i = 65; i <=90; i++) {
            System.out.println((char)i+" "+i);
        }
    }
}



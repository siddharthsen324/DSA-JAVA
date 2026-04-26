// this is a class for relational oprators
import java.util.Scanner;
public class RelationalOpretors {

    public static void main(String[] args) {
//        System.out.println(5==3+2);//        System.out.println(5!=3+2);
//        boolean x=(5>3);
//        System.out.println(x);    // this answer is true because 5 is greater than 3 than print true
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
}


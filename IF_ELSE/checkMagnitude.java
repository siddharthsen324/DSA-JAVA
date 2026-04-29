// check this magnitude
import java.util.Scanner;

public class checkMagnitude {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int x =sc.nextInt();
        int magnitude;
        if(x<0){
             magnitude=-x;
        }
        else{
             magnitude=x;
        }
        if(magnitude<69){
            System.out.println("The magnitude smaller than 69");
        }
        else{
            System.out.println("The magnitude greater than 69");
        }
    }
}

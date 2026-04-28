import java.util.Scanner;

public class SideOfTriangle {
     static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter ths first side :");
        int a= sc.nextInt();
        System.out.println("enter ths second side :");
        int b= sc.nextInt();
        System.out.println("enter ths third side :");
        int c= sc.nextInt();
        if(a+b>c && a+c>b && c+b>a){
            System.out.println("the vaild triangle");
        }
        else {
            System.out.println("not vaild triangle");
        }

    }
}

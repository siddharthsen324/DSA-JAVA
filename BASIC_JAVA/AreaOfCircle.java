import java.util.Scanner;

public class AreaOfCircle {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("entere the radius:");
        double r=sc.nextDouble();
        double area=3.141592*r*r;
        System.out.println(area);
    }
}


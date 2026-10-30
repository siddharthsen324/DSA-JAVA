import java.util.Scanner;

public class SumOfArray {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the array size :");
        int n= sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.print("enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum all element is :"+sum);
    }
}

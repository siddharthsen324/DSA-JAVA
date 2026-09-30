import java.util.Scanner;

public class PrintMax {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        System.out.println("enter the elements :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("the max element is "+max);
    }
}

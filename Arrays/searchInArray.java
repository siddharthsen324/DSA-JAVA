import java.util.Scanner;

public class searchInArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the searching element");
        int x=sc.nextInt();
        boolean found=false;
        for (int i = 0; i <n; i++) {
            if(arr[i]==x) {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("Element exists in array");
        } else {
            System.out.println("Element nahi hai");
        }
    }
}

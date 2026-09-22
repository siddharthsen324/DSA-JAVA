import java.util.Scanner;

public class arrayOpration {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of element :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element od array :");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                arr[i]+=10;
            }else {
                arr[i]*=2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

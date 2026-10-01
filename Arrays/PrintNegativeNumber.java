import java.util.Scanner;

public class PrintNegativeNumber {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the array size :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the negative element are");
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
        if(c==1) System.out.println("not negative number here ");
    }
}

import java.util.Scanner;

public class InputAndOutput {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr={1,2,3,4,5,6};
//        System.out.println(arr.length);
//        int n=arr.length;
//        for (int i = 0; i <=n-1; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int[] arr =new int[7];
//        for (int i = 0; i <=6; i++) {
//          System.out.print(arr[i]+" ");
//        }
        for (int i = 0; i <7 ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <7; i++) {
            System.out.print((arr[i]*2)+" ");
        }
    }
}
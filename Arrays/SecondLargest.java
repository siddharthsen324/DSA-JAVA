import java.util.Scanner;

public class SecondLargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 10, 1, 6, 3, 8};
        int max=arr[0];
        int smax=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("second largest element is "+smax);
    }
}

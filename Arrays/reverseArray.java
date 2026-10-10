import java.util.Scanner;

public class reverseArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {4, 10, 1, 6, 3, 8};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
}
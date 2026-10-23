import java.util.Arrays;
public class ShallowAndDeepCopy {
    static void main(String[] args) {
        int[] arr={1,2,3,4};
//        int[] x=arr;// x is a shallow copy
//        x[0]=100;
//        System.out.println(arr[0]);
        int[] y=Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(arr[0]);
        System.out.println(y[0]);
    }
}

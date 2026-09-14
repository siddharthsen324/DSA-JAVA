
import java.util.*;

public class ArrayListInJavaBasic {
    static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(26);
        arr.add(25);
        arr.add(24);
        System.out.println(arr.get(2));
        arr.set(2,50);
        System.out.println(arr);//not be traverse
        int n=arr.size();
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        arr.add(27);
        arr.add(28);
        int i=0,j= arr.size()-1;
        while (i<j){
            int temp=arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        //Collections.reverse(arr);
        System.out.println(arr);

    }
}

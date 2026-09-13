import java.util.*;

public class addingOne {
    static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr={9,9,9};
        int carry=1;
        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }
            else {
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}

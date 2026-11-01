public class waveArray {
    static void main(String[] args) {
        int[] arr={2,4,7,8,9,10};
        int n=arr.length;
        for (int i = 0; i < n-1; i+=2) {
            if(i==arr.length-1) break;
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

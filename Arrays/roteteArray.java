public class roteteArray {
    public static void swap(int[]arr,int a,int b){
        int i=a,j=b;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void main(String[] args) {

          int[] arr={1,2,3,4,5};
          int n=arr.length;
          int d=2;
          d%=n;
          swap(arr,0,d-1);
          swap(arr,d,n-1);
          swap(arr,0,n-1);
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

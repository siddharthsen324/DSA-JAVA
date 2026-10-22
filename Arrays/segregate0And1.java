public class segregate0And1 {
    static void main(String[] args) {
//        int count0=0;
//        int[] arr={0,0,1,1,0};
//        for (int i = 0; i <arr.length; i++) {
//            if(arr[i]==0) count0++;
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i]=0;
//        }
//        for (int i = count0; i <arr.length; i++) {
//            arr[i]=1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }


        int[]arr={1,0,1,0,1,0,0};
        int i=0,j=arr.length-1;
        while (i<j){
            if(arr[i]==0){
                i++;
            } else if (arr[j]==1) {
                j--;
            }else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

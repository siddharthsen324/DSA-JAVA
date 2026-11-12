public class maxElement {
    static void main(String[] args) {
        int[][] arr={{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int max=0,s=0,e=0;
        for (int i=0 ;i<=arr.length-1;i++){
            for (int j = 0; j <arr.length-1; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                    s=i;
                    e=j;
                }
            }
        }
        System.out.println("the maximum element is "+ max+" "+s+" "+e);
    }
}

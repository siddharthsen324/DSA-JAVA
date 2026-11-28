public class searchMatrix {
    static void main(String[] args) {
        int [][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
        int n=arr.length,m=arr[0].length;
        int i=0,j=m-1;
        int tar=5;
        boolean f=false;
        while(j>=0 && i<n){
            if(arr[i][j]>tar)j--;
            else if(arr[i][j]<tar)i++;
            else {
                f=true;
                break;
            }
        }
        if(f==true) System.out.println("mil gaya");
    }
}
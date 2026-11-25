public class RoteteBy90Degree {
    private static void print(int[][]arr){
        for(int []a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [][]arr={{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        int row=arr.length;
        int col=arr[0].length;
        int ans[][]=new int [col][row];
        // trapose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i]=arr[i][j];
            }
        }
        //swap
        for (int i = 0; i <ans.length ; i++) {
            int stcol=0,endcol=ans[0].length-1;
            while (stcol<endcol){
                int temp=ans[i][stcol];
                ans[i][stcol]=ans[i][endcol];
                ans[i][endcol]=temp;
                stcol++;
                endcol--;
            }
        }
        print(ans);
    }
}

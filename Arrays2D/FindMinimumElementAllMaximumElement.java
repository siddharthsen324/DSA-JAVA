public class FindMinimumElementAllMaximumElement {
    static void main(String[] args) {
        int [][] arr={{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int overallmin=Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            int rowmax=Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>rowmax){
                    rowmax=arr[i][j];
                }
            }
            if(rowmax<overallmin){
                overallmin=rowmax;
            }
        }
        System.out.println(overallmin);
    }
}

public class PrintRowInReverse {
    static void main(String[] args) {
        int [][] arr={{6,0,2,7,6},{1,3,7,2,8},{9,9,4,5,2}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[0].length-1; j >= 0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(arr[0].length);
    }
}

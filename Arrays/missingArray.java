public class missingArray {
    static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arraySum=0;
        for(int ele:arr){
            arraySum+=ele;
        }
        System.out.println("missing element is "+(sum-arraySum));
    }
}

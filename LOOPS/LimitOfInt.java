// This program demonstrates the maximum values of int and long data types in Java.
public class LimitOfInt {
    static void main(String[] args) {
        int x=Integer.MAX_VALUE;// The maximum value of an int in Java is 2,147,483,647 (2^31 - 1)
        long y=Long.MAX_VALUE;// The maximum value of a long in Java is 9,223,372,036,854,775,807 (2^63 - 1)
        System.out.println(x);
        System.out.println(y);
    }
}
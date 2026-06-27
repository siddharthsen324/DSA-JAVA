
public class Argument {
    public static void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public static void max(int a, int b,int c){
        System.out.println(Math.max(Math.max(a,b),c));
    }
    static void main(String[] args) {
        sum(5,6,9);// argument
        max(5,6,9);
    }
}


public class ReturnType {
    public static int prasun(int a){
        System.out.println("bhanu");
        System.out.println("Nanda");
        if (a>0) return 5;
        else return 10;
    }
    static void main(String[] args) {
        prasun(7);
        System.out.println(" ***** ");
        System.out.println(prasun(7));
        System.out.println(" ***** ");
        int x=prasun(7);
        System.out.println(3+x);
    }
}

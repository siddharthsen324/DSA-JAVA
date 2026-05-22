// continue statement is used to skip the current iteration of the loop and move to the next iteration.
public class contiune {
    static void main(String[] args) {
        for (int i = 1; i <=20; i++) {
            System.out.println(i);
            if (i==13) continue;
            System.out.println("good morning");
        }
    }
}

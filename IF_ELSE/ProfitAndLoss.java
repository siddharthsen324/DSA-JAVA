import java.util.Scanner;

public class ProfitAndLoss {

    // Main method where program execution starts
    static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter cost price
        System.out.print("Enter the cost price: ");
        int cp = sc.nextInt();

        // Ask user to enter selling price
        System.out.print("Enter the selling price: ");
        int sp = sc.nextInt();

        // Check if there is no profit and no loss
        if (sp == cp) {
            System.out.println("No profit no loss");
        }
        // Check if there is profit
        else if (sp > cp) {
            System.out.println("Profit is: " + (sp - cp));
        }

        // Check if there is loss
        if (sp < cp) {
            System.out.println("Loss is: " + (cp - sp));
        }
    }
}
/*
alex skeries
 */
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your total budget for the month: ");
        int totalBudget = input.nextInt();

        int remainingBudget = totalBudget;
        int expense = -1; 

        while (expense != 0) {
            System.out.print("Enter an expense (0 to stop): ");
            expense = input.nextInt();

            if (expense != 0) {
                remainingBudget -= expense;

                if (remainingBudget < 0) {
                    System.out.println("Warning: You have exceeded your budget!");
                }
            }
        }

        System.out.println("----------------------");
        System.out.println("Your remaining budget is: " + remainingBudget);
    }
}

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String coffeeSize;

        coffeeSize = scnr.nextLine();  // Read user input

        if (coffeeSize.equals("Large")) {
            System.out.println("Price: $5.50");
        }
        else if (coffeeSize.equals("Medium")) {
            System.out.println("Price: $4.25");
        }
        else if (coffeeSize.equals("Small")) {
            System.out.println("Price: $3.00");
        }
        else {
            System.out.println("Error: Invalid Size");
        }
    }
}

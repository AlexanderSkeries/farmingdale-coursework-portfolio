6// Alex Skeries - Green Horizon Project

import java.util.Scanner;

public class GreenHorizon {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Basic item data stored in parallel arrays
        String[] itemNames = {"Seeds", "Shovel", "Potting Mix", "Pot", "Pesticides"};
        double[] itemPrices = {3.99, 12.99, 8.99, 6.99, 7.99};
        int[] stockCount = {10, 5, 6, 8, 10};

        printHeader();

        int choice = 0;          // Tracks menu selection
        double totalSales = 0;   // Running total of all purchases

        // Loop runs until the user chooses option 3 (Exit)
        while (choice != 3) {

            System.out.println("1. View Inventory");
            System.out.println("2. Purchase Item");
            System.out.println("3. Exit");
            System.out.println("4. View Total Sales");
            System.out.println("99. Admin Restock");
            System.out.print("Selection: ");

            // Prevent crash if user enters letters instead of numbers
            if (!scnr.hasNextInt()) {
                System.out.println("Invalid input.");
                scnr.nextLine();
                continue;
            }

            choice = scnr.nextInt();

            // Show all items with prices and stock
            if (choice == 1) {

                System.out.println("\n----- CURRENT INVENTORY -----");
                System.out.printf("%-15s %-10s %-10s\n", "Item", "Price", "Stock");

                for (int i = 0; i < itemNames.length; i++) {
                    System.out.printf("%-15s $%-9.2f %-10d\n",
                            itemNames[i], itemPrices[i], stockCount[i]);
                }
                System.out.println();
            }

            // Handle purchasing an item
            else if (choice == 2) {

                scnr.nextLine();  // Clear leftover newline
                System.out.print("Enter item name: ");

                // Store whatever item name the user typed so it can be looked up in the array
                String target = scnr.nextLine();

                // Look up the item by name; returns its position in the array
                // If the item isn't found, the method returns -1
                int index = findItemIndex(itemNames, target);

                if (index == -1) {
                    System.out.println("Item not found.");

                    // Skip the rest of this loop right now and jump back to the top
                    continue;
                }

                System.out.print("How many would you like? ");

                // Prevent crash if quantity isn't a number
                if (!scnr.hasNextInt()) {
                    System.out.println("Invalid quantity.");
                    scnr.nextLine();
                    continue;
                }

                int qty = scnr.nextInt();

                // Basic quantity checks
                if (qty <= 0) {
                    System.out.println("Invalid quantity.");
                    continue;
                }

                if (qty > stockCount[index]) {
                    System.out.println("Not enough stock available.");
                    continue;
                }

                // Reduce stock by the purchased amount
                stockCount[index] -= qty;

                // Calculate final price including tax
                double total = calculateTotal(itemPrices[index], qty);

                System.out.printf("Transaction Complete! Total (with tax): $%.2f\n", total);

                System.out.println("Remaining " + itemNames[index] +
                                   " in stock: " + stockCount[index]);

                // Add this sale to the running total
                totalSales += total;
            }

            // Admin-only restock option
            else if (choice == 99) {

                System.out.println("ADMIN: Restock Mode");

                // Show items with their index numbers for reference
                for (int i = 0; i < itemNames.length; i++) {
                    System.out.println(i + ": " + itemNames[i] +
                                       " (Stock: " + stockCount[i] + ")");
                }

                System.out.print("Enter item index to restock: ");

                // Prevent crash if index isn't a number
                if (!scnr.hasNextInt()) {
                    System.out.println("Invalid index.");
                    scnr.nextLine();
                    continue;
                }

                int index = scnr.nextInt();

                // Make sure the index is valid
                if (index < 0 || index >= itemNames.length) {
                    System.out.println("Invalid index.");
                    continue;
                }

                System.out.print("Enter amount to add: ");

                // Prevent crash if amount isn't a number
                if (!scnr.hasNextInt()) {
                    System.out.println("Invalid amount.");
                    scnr.nextLine();
                    continue;
                }

                int amount = scnr.nextInt();

                if (amount <= 0) {
                    System.out.println("Invalid amount.");
                    continue;
                }

                // Increase stock
                stockCount[index] += amount;

                System.out.println(itemNames[index] +
                                   " restocked. New stock: " + stockCount[index]);
            }

            // Exit option
            else if (choice == 3) {
                System.out.println("Exiting...");
            }

            // Show total sales so far
            else if (choice == 4) {
                System.out.printf("Total Sales: $%.2f\n", totalSales);
            }

            // Anything else is invalid
            else {
                System.out.println("Invalid Choice");
            }

        } // end while loop

    } // end main


    // Searches for an item name and returns its index.
    // Using the index lets us access the matching price and stock.
    public static int findItemIndex(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;  // Not found
    }

    // Computes the total cost including tax
    public static double calculateTotal(double price, int quantity) {
        double subtotal = price * quantity;
        double taxRate = 0.08625;
        return subtotal + (subtotal * taxRate);
    }

    // Simple header for the program
    public static void printHeader() {
        System.out.println("***************************************");
        System.out.println("   WELCOME TO GREEN HORIZON GARDENS");
        System.out.println("***************************************");
    }

}
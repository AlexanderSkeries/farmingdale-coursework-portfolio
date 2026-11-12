import java.util.Scanner;


public class Program {


    public static void main(String[] args) {
       Scanner scnr =  new Scanner(System.in);
       
       String itemName;
       int itemID;
       double unitPrice;
       
       System.out.print("Enter Item Name: ");
       itemName = scnr.nextLine();
       
       System.out.print("Enter Item ID: ");
       itemID = scnr.nextInt();
       
       System.out.print("Enter Unit Price: $");
       unitPrice = scnr.nextDouble();
       
       System.out.println();
       System.out.printf("%-20s %-10s %12s%n", "Item Name", "Item ID", "Unit Price");
       System.out.printf("%-20s %-10d $%11.2f%n", itemName, itemID, unitPrice);
    }
    
}

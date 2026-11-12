import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        //Read entire line
        System.out.print("Please type the inventory data: ");
        String inputLine = scnr.nextLine();
        
        //Creating a second scanner to parse the line 
        Scanner lineScanner = new Scanner(inputLine);
        
        String itemName = lineScanner.next();
        int aisleNumber = lineScanner.nextInt();
        double unitCost = lineScanner.nextDouble();
        char conditionCode = lineScanner.next().charAt(0);
        
        //Calculating total value for quantity of 10
        double totalValue = unitCost * 10;
                
        System.out.println("Item Name " + itemName);
        System.out.println("Aisle Number: " + aisleNumber);
        System.out.println("Unit Cost: " + unitCost);
        System.out.println("Condition Code: " + conditionCode);
        System.out.println("Total Value (10 units): " + totalValue);

        
        
        
    }
    
}

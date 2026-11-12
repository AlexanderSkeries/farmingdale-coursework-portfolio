
package ch3_coffeereceipt;


public class Ch3_CoffeeReceipt {


    public static void main(String[] args) {
           String item = "Coffee";
        int quantity = 3;
        double price = 4.99;
        double total = quantity * price;
        
        
        System.out.println("------Receipt------");
        
        
        //1. basic formatting: %s for string, %d for integer
        System.out.printf("Item: %s %n", item);
        System.out.printf("Qty: %d %n", quantity);
        
        //2. precision: %.2f limits a double to 2 decimal places
     //   System.out.printf("Price: %d.2f %n", price);
        
        //3. width and alignment:
        //%-10s means a string left-aigned in a 10 character block
        // %8.2f means a double in an 8-character block with 2 decimal places
        
        System.out.println("---------------------------");
        System.out.printf("%-10s %8s %n", "TOTAL:", "AMOUNT");
        System.out.printf("%-10s $%.2f %n", item, total);
        System.out.println("---------------------------");
    }
    
}

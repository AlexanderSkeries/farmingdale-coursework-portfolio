import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.print("Enter a word (String): ");
      String userString = scnr.next();
      
      System.out.print("Enter a whole number (int): ");
      int UserInt = scnr.nextInt();  
      
      System.out.print("Enter a double: ");
      double userDouble = scnr.nextDouble();
      
      System.out.print("Enter a single character (char): ");
      char userChar = scnr.next(). charAt(0);      
      
      System.out.println("\n--- Results ---");
      System.out.println("String: " + userString);
      System.out.println("Integer: " + userInt);
      System.out.println("Double: " + userDouble);
      System.out.println("Character: " + userChar);
      
    }
    
}

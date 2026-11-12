/*
Alex Skeries
 */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;
        
        do {
            System.out.println("Enter a number in between 100 and 999: ");
            userNum = input.nextInt();
        
        if (userNum < 100 || userNum > 999) {
            System.out.println("Invalid Code. Try Again.");
        }    
        else if (userNum != 456) {
            System.out.println("Invalid Code. Try Again.");
        }
        }
        while (userNum != 456);
            System.out.println("Code accepted. Access granted.");
        
      
    }
    
}

/*
alex skeries array example
 */

import java.util.Scanner;
public class Program {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Creating an integer array with space for 3 integers
        int[] intNumbersArray = new int[3]; // 3 is size of array
        
        System.out.println("Enter 3 integers:");
        // Read 3 integers from the user and store them in the array
        for (int i = 0; i < intNumbersArray.length; i++) {
            intNumbersArray[i] = scnr.nextInt();
        }
        System.out.print("\nInteger Array: \n");
        // Loop to print array contents (currently prints index instead of value)
        for (int i = 0; i < intNumbersArray.length; i++){
        System.out.println(i+1 + ": " + i);
        }
    }
    
}

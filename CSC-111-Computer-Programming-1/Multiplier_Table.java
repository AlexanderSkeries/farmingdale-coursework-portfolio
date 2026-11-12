/*
Alex Skeries
 */

import java.util.Scanner;

        
public class Program {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        
        System.out.print("Enter The Table Base: ");
        int base = scnr.nextInt();
        
        System.out.print("Enter the Range: ");
        int range = scnr.nextInt();
        
        for (int i = 1; i <= range; i++) {
            int product = base * i;
            System.out.println(base + " x " + i + " = " + product);
            
        }
        
        
    }
    
}

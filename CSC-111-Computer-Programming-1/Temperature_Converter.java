/*
good
 */
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        
        System.out.println("Please type the value of Fahrenheit: ");
        
        fahrenheit = scnr.nextDouble();
        
         celsius = convertToCelsius(fahrenheit);
         displayResults(fahrenheit, celsius);
    }
    
        
    public static double convertToCelsius(double fahrenheit) 
    {
        double  celsius = (fahrenheit - 32.0) *  (5.0 / 9.0); 
        return celsius;
    }
    
    public static void displayResults(double f, double c)
    {
        System.out.print("The Conversion From Fahrenheit To Celsius Is: ");   
        System.out.printf("%.2f\n", c);
    }
    
}
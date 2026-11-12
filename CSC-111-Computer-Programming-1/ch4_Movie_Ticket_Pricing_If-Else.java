import java.util.Scanner;

//Alex Skeries
// if person is 13 yrs or older the ticket costs $12
//otherwise under 12, it costs $18
public class Program {


    public static void main(String[] args) {
       // if / else statements
       Scanner scnr = new Scanner(System.in);
       int userAge;
       int ticketPrice;
       
       System.out.println("Please enter your age: ");
       userAge = scnr.nextInt();
       
       // the if-else branch logic
       if(userAge >= 13)
           
       {
           ticketPrice=12;
           System.out.println("Hi, Your age is " + userAge);
       }
       else
       {
            ticketPrice = 8;
                         
       }
      System.out.println("Your ticket price is: $" + ticketPrice);
       
    }
    
}

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String city;
        int attendees;
        double price;        
        char section;
                
        System.out.println("Enter City:");
        city = scnr.next();
        price = scnr.nextDouble();
        attendees = scnr.nextInt();
        section = scnr.next().charAt(0);
        
        System.out.println("\n--- Event Summary ------");
        System.out.println("Event Location: " + city);
        System.out.println("Number of Attendees: " + attendees);
        System.out.println("Price per Ticket: $" + price);
        System.out.println("Seating Section");
        
        
    }
    
}

import java.util.Scanner;


public class LabProgram {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String yourName = "none";
        
        System.out.println("Please enter your name: " + yourName);
        yourName = myScanner.next();
        
        System.out.println("Hello" + yourName);
    }
}

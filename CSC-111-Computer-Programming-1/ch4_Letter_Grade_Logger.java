import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numericalScore;
        
        numericalScore = scnr.nextInt();
        
        if (numericalScore >= 90) {
        System.out.println("A");  }
        
        else if ((numericalScore <= 89)&&(numericalScore >= 80)){
        System.out.println("B");  }
        
        else if ((numericalScore <= 79)&&(numericalScore >= 70)){
        System.out.println("C");  }
        
        else if ((numericalScore <= 69)&&(numericalScore >= 61)){
        System.out.println("D");  }
        
        else {
        System.out.println("F");  }
        
                
    }
    
}

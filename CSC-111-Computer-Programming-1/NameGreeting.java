import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author wh208
 */
public class LabProgram {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String yourName = "none";
        
        System.out.println("Please enter your name: " + yourName);
        yourName = myScanner.next();
        
        System.out.println("Hello" + yourName);
    }
}

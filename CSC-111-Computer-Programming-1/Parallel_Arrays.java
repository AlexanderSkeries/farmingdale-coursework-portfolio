/*
alex skeries parallel arrays
 */
public class Program {


    public static void main(String[] args) {
       
        //Parallel Arrrays: Names and thier corresponding scores
        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana"};
        int[] studentGrades = {95, 82, 71, 88};
        
        System.out.println("---- Student Grade Report ----");
        
        for (int i = 0; i< studentNames.length; i++) {
         
        String letterGrade;    
        
        if (studentGrades[i] >= 90) {
        letterGrade = "A";        
        } else if (studentGrades[i] >= 80) {
        letterGrade = "B";
        } else if (studentGrades[i] >= 70) {
        letterGrade = "C";
        } else if (studentGrades[i] >= 60) {
        letterGrade = "D";
        } else {
        letterGrade = "F";
        }
        
        System.out.println("Student: " + studentNames[i] +
                           " | Score: " + studentGrades[i] +
                           " | Grade: " + letterGrade);
        
        } 
    }
    
}

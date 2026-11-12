/*
alex skeries parallel arrays
 */
public class Program {


    public static void main(String[] args) {
       
        //Parallel Arrrays: Names and thier corresponding scores
        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana"};
        int[] studentGrades = {95, 82, 71, 88};
        
        // call the void method and pass arrays
        printGradeReport(studentNames, studentGrades);
    }
        
        // Method that receives two parallel arrays and prints a grade report
        public static void printGradeReport(String[] names, int[] grades) {
        System.out.println("---- Student Grade Report ----");
        
        // Loop through the arrays using the same index
        for (int i = 0; i< grades.length; i++) {
         
        String letterGrade;    
        
        // Determine letter grade based on numeric score
        if (grades[i] >= 90) {
        letterGrade = "A";        
        } else if (grades[i] >= 80) {
        letterGrade = "B";
        } else if (grades[i] >= 70) {
        letterGrade = "C";
        } else if (grades[i] >= 60) {
        letterGrade = "D";
        } else {
        letterGrade = "F";
        }
        
        // Print each student's name, score, and assigned letter grade 
        System.out.println("Student: " + names[i] +
                           " | Score: " + grades[i] +
                           " | Grade: " + letterGrade);
        
        } 
    }
    
}

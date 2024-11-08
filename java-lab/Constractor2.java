
//2.Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F. Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater then 100. Finally, call the letterGrade() method to get and print the grade
import java.util.*;

class Grader {
    private int grade;
    
    Grader(int grade){
        this.grade = grade; 
    }

    public String letterGrade() {
        if (grade >= 90) {
            return "O"; // Outstanding
        } else if (grade >= 80) {
            return "E"; // Excellent
        } else if (grade >= 70) {
            return "A"; // Very Good
        } else if (grade >= 60) {
            return "B"; // Good
        } else if (grade >= 50) {
            return "C"; // Average
        } else if (grade >= 40) {
            return "D"; // Pass
        } else {
            return "F"; // Fail
        }
    }
}

    public class Constractor2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the Number that you got !");
            int num = sc.nextInt();

            if (num < 0 || num > 100) {
                System.out.println("Wrong Input!");
            } else {
                Grader obj = new Grader(num);
                System.out.println("The grade you got :- " + obj.letterGrade());
            }
        }
}

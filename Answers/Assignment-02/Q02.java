// Assignment 02 - Question 02: Student Grade Calculation
public class Q02 {
    static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        int marks = 82;
        char grade = calculateGrade(marks);
        System.out.println("Student Marks: " + marks);
        System.out.println("Calculated Grade: " + grade);
    }
}
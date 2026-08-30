// Assignment 02 - Question 02: Student Grade Calculation
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();

        char grade = calculateGrade(marks);

        System.out.println();
        System.out.println("--- Result ---");
        System.out.println("Marks: " + marks);
        System.out.println("Calculated Grade: " + grade);

        sc.close();
    }
}
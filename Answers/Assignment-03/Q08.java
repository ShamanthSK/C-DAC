// Assignment 03 - Question 08: Student Marks Analysis
import java.util.Scanner;

public class Q08 {
    static void analyzeMarks(int[] marks) {
        int total = 0;
        int max = marks[0];
        int min = marks[0];

        for (int mark : marks) {
            total += mark;
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }
        double average = (double) total / marks.length;

        System.out.println();
        System.out.println("--- Marks Analysis Summary ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Mark: " + max);
        System.out.println("Lowest Mark: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (n): ");
        int n = sc.nextInt();

        int[] studentMarks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            studentMarks[i] = sc.nextInt();
        }

        analyzeMarks(studentMarks);

        sc.close();
    }
}
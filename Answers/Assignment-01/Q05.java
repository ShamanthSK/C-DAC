// Assignment 01 - Question 05: Calculate Total and Average
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println();
        System.out.println("--- Marks Summary ---");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
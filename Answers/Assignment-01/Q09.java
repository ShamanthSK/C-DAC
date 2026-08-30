// Assignment 01 - Question 09: Voting Eligibility
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter person's age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Status: Eligible to vote.");
        } else {
            System.out.println("Status: Not eligible to vote.");
        }

        sc.close();
    }
}
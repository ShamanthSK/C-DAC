// Assignment 02 - Question 05: Check Voting Eligibility
import java.util.Scanner;

public class Q05 {
    static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        boolean eligible = isEligible(age);

        System.out.println();
        System.out.println("--- Voting Status ---");
        System.out.println("Age: " + age);
        if (eligible) {
            System.out.println("Status: Eligible to vote.");
        } else {
            System.out.println("Status: Not eligible to vote.");
        }

        sc.close();
    }
}
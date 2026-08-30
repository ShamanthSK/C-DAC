// Assignment 01 - Question 03: Simple Interest
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println();
        System.out.println("--- Simple Interest Calculation ---");
        System.out.println("Principal Amount: Rs. " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: Rs. " + simpleInterest);
        System.out.println("Total Amount Payable: Rs. " + totalAmount);

        sc.close();
    }
}
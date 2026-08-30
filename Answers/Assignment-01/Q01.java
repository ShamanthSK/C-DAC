// Assignment 01 - Question 01: Arithmetic Operations
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;

        System.out.println();
        System.out.println("--- Arithmetic Results ---");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);

        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Division: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division & Remainder: Cannot divide by zero.");
        }

        sc.close();
    }
}
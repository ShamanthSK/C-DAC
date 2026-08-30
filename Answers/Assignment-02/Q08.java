// Assignment 02 - Question 08: Simple Calculator
import java.util.Scanner;

public class Q08 {
    static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b != 0) return a / b;
                else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid Operator!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = calculate(num1, num2, operator);

        System.out.println();
        System.out.println("--- Calculation Result ---");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        sc.close();
    }
}
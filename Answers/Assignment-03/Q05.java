// Assignment 03 - Question 05: Simple Calculator
import java.util.Scanner;

public class Q05 {
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
            case '%':
                if (b != 0) return a % b;
                else {
                    System.out.println("Error: Modulo by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        double result = calculate(num1, num2, op);

        System.out.println();
        System.out.println("--- Result ---");
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);

        sc.close();
    }
}
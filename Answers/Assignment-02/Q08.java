// Assignment 02 - Question 08: Simple Calculator
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
        double num1 = 25.0;
        double num2 = 5.0;
        char operator = '*';

        double result = calculate(num1, num2, operator);
        System.out.println("Num 1: " + num1 + ", Num 2: " + num2 + ", Operator: " + operator);
        System.out.println("Result: " + result);
    }
}
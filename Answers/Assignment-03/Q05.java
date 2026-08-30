// Assignment 03 - Question 05: Simple Calculator
public class Q05 {
    static double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b != 0) return a / b;
                else {
                    System.out.println("Division by zero error!");
                    return Double.NaN;
                }
            case '%':
                if (b != 0) return a % b;
                else {
                    System.out.println("Modulo by zero error!");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operator!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 6;
        char op = '%';

        double result = calculate(num1, num2, op);
        System.out.println("Calculation: " + num1 + " " + op + " " + num2 + " = " + result);
    }
}
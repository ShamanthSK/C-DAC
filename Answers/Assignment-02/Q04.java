// Assignment 02 - Question 04: Largest of Two Numbers
import java.util.Scanner;

public class Q04 {
    static int findLargest(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int largest = findLargest(num1, num2);

        System.out.println();
        System.out.println("--- Comparison Result ---");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Largest Number: " + largest);

        sc.close();
    }
}
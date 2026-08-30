// Assignment 03 - Question 02: Sum of Digits
import java.util.Scanner;

public class Q02 {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = sumOfDigits(number);

        System.out.println();
        System.out.println("--- Digit Sum Result ---");
        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + sum);

        sc.close();
    }
}
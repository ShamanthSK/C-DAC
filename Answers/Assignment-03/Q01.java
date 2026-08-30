// Assignment 03 - Question 01: Reverse a Number
import java.util.Scanner;

public class Q01 {
    static int reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int reversed = reverseNumber(number);

        System.out.println();
        System.out.println("--- Reverse Result ---");
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}
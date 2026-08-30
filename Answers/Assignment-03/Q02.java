// Assignment 03 - Question 02: Sum of Digits
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
        int number = 9876;
        int sum = sumOfDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Sum of Digits: " + sum);
    }
}
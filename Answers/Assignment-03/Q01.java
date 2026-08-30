// Assignment 03 - Question 01: Reverse a Number
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
        int number = 12345;
        int reversed = reverseNumber(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}
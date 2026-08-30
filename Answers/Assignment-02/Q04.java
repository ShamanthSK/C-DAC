// Assignment 02 - Question 04: Largest of Two Numbers
public class Q04 {
    static int findLargest(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 89;

        int largest = findLargest(num1, num2);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Largest Number: " + largest);
    }
}
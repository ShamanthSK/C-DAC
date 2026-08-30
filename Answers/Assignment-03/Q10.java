// Assignment 03 - Question 10: Count Even and Odd Numbers
import java.util.Scanner;

public class Q10 {
    static int[] countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int[] counts = countEvenOdd(numbers);

        System.out.println();
        System.out.println("--- Even/Odd Counts ---");
        System.out.println("Even Numbers Count: " + counts[0]);
        System.out.println("Odd Numbers Count: " + counts[1]);

        sc.close();
    }
}
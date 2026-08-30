// Assignment 03 - Question 07: Find Maximum and Minimum
import java.util.Scanner;

public class Q07 {
    static int[] findMaxMin(int[] arr) {
        if (arr.length == 0) return new int[]{0, 0};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return new int[]{max, min};
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

        int[] result = findMaxMin(numbers);

        System.out.println();
        System.out.println("--- Array Analysis ---");
        System.out.println("Maximum Element: " + result[0]);
        System.out.println("Minimum Element: " + result[1]);

        sc.close();
    }
}
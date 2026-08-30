// Assignment 03 - Question 09: Search an Element
import java.util.Scanner;

public class Q09 {
    static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n): ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int position = searchElement(array, target);

        System.out.println();
        System.out.println("--- Search Result ---");
        if (position != -1) {
            System.out.println("Element " + target + " found at index position " + position + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }
}
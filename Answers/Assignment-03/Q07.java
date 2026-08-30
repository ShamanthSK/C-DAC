// Assignment 03 - Question 07: Find Maximum and Minimum
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
        int[] numbers = {34, 12, 89, 5, 67, 23};

        System.out.print("Array elements: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        int[] result = findMaxMin(numbers);
        System.out.println("Maximum Element: " + result[0]);
        System.out.println("Minimum Element: " + result[1]);
    }
}
// Assignment 03 - Question 10: Count Even and Odd Numbers
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
        int[] numbers = {12, 17, 24, 35, 40, 51, 68};

        System.out.print("Array elements: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        int[] counts = countEvenOdd(numbers);
        System.out.println("Count of Even Numbers: " + counts[0]);
        System.out.println("Count of Odd Numbers: " + counts[1]);
    }
}
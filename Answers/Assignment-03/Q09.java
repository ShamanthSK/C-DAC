// Assignment 03 - Question 09: Search an Element
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
        int[] array = {15, 28, 42, 9, 63};
        int target = 42;

        System.out.print("Array: ");
        for (int el : array) System.out.print(el + " ");
        System.out.println();

        int position = searchElement(array, target);
        if (position != -1) {
            System.out.println("Element " + target + " found at index position " + position + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
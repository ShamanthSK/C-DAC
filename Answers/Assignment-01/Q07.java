// Assignment 01 - Question 07: Positive, Negative or Zero
public class Q07 {
    public static void main(String[] args) {
        int number = -12;

        System.out.println("Given Number: " + number);
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
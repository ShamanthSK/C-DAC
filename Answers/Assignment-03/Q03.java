// Assignment 03 - Question 03: Multiplication Table
public class Q03 {
    static void printTable(int num) {
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        int number = 7;
        printTable(number);
    }
}
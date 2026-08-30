// Assignment 01 - Question 04: Temperature Conversion
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println();
        System.out.println("--- Temperature Conversion ---");
        System.out.println("Celsius: " + celsius + " deg C");
        System.out.println("Fahrenheit: " + fahrenheit + " deg F");

        sc.close();
    }
}
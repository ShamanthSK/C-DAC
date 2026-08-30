// Assignment 02 - Question 07: Temperature Conversion
import java.util.Scanner;

public class Q07 {
    static double convertTemperature(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = convertTemperature(celsius);

        System.out.println();
        System.out.println("--- Temperature Status ---");
        System.out.println("Celsius: " + celsius + " deg C");
        System.out.println("Fahrenheit: " + fahrenheit + " deg F");

        if (fahrenheit > 100) {
            System.out.println("Notice: Temperature is above 100 deg F!");
        } else {
            System.out.println("Notice: Temperature is within normal range.");
        }

        sc.close();
    }
}
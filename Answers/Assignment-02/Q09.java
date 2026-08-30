// Assignment 02 - Question 09: Bus Ticket Fare
import java.util.Scanner;

public class Q09 {
    static double calculateFare(int age) {
        if (age < 5) {
            return 0.0;
        } else if (age <= 12) {
            return 20.0;
        } else if (age <= 59) {
            return 40.0;
        } else {
            return 25.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String passengerName = sc.nextLine();

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        double fare = calculateFare(age);

        System.out.println();
        System.out.println("--- Bus Ticket Receipt ---");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + age);
        System.out.println("Ticket Fare: Rs. " + fare);

        sc.close();
    }
}
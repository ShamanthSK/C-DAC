// Assignment 03 - Question 06: Menu-Driven Area Calculator
import java.util.Scanner;

public class Q06 {
    static double calculateArea(int choice, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                return Math.PI * r * r;
            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                return l * b;
            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                return 0.5 * base * h;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 4) {
            System.out.println("Thank you!");
        } else {
            double area = calculateArea(choice, sc);
            if (area != -1) {
                System.out.println("Calculated Area = " + area);
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
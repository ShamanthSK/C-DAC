// Assignment 03 - Question 06: Menu-Driven Area Calculator
public class Q06 {
    static double calculateArea(int choice, double r, double l, double b, double h) {
        switch (choice) {
            case 1: return Math.PI * r * r;
            case 2: return l * b;
            case 3: return 0.5 * b * h;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        int choice = 2;
        double radius = 5.0;
        double length = 10.0;
        double breadth = 4.0;
        double height = 6.0;

        System.out.println("--- Menu ---");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Exit");
        System.out.println("Selected Choice: " + choice);

        double area = calculateArea(choice, radius, length, breadth, height);
        if (area != -1) {
            System.out.println("Calculated Area: " + area);
        } else {
            System.out.println("Invalid Choice!");
        }
    }
}
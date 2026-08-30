// Assignment 01 - Question 02: Area of a Circle
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double pi = Math.PI;
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println();
        System.out.println("--- Circle Calculations ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);

        sc.close();
    }
}
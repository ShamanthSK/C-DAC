// Assignment 01 - Question 02: Area of a Circle
public class Q02 {
    public static void main(String[] args) {
        double radius = 7.0;
        double pi = 3.14159;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}
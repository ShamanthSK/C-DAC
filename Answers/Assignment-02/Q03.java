// Assignment 02 - Question 03: Product Discount
import java.util.Scanner;

public class Q03 {
    static double calculateFinalPrice(double price) {
        double discount = 0.0;
        if (price >= 10000) {
            discount = price * 0.20;
        } else if (price >= 5000) {
            discount = price * 0.10;
        } else if (price >= 2000) {
            discount = price * 0.05;
        } else {
            discount = 0.0;
        }
        return price - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        double finalPrice = calculateFinalPrice(price);

        System.out.println();
        System.out.println("--- Product Invoice ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Final Price after Discount: Rs. " + finalPrice);

        sc.close();
    }
}
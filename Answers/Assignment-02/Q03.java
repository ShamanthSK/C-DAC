// Assignment 02 - Question 03: Product Discount
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
        int productId = 101;
        String productName = "Laptop";
        double price = 12000.0;

        double finalPrice = calculateFinalPrice(price);

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Final Price after Discount: Rs. " + finalPrice);
    }
}
// Assignment 01 - Question 03: Simple Interest
public class Q03 {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 5.5;
        double time = 3.0; // in years

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("Principal Amount: Rs. " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: Rs. " + simpleInterest);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }
}
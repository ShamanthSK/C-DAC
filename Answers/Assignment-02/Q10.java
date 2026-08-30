// Assignment 02 - Question 10: Mobile Data Usage
import java.util.Scanner;

public class Q10 {
    static double calculateCharge(double usageGB) {
        if (usageGB <= 1.0) {
            return 50.0;
        } else if (usageGB <= 5.0) {
            return 100.0;
        } else if (usageGB <= 10.0) {
            return 200.0;
        } else {
            return 350.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        long mobileNumber = sc.nextLong();

        System.out.print("Enter data usage in GB: ");
        double dataUsage = sc.nextDouble();

        double charge = calculateCharge(dataUsage);

        System.out.println();
        System.out.println("--- Data Usage Bill ---");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Data Usage: " + dataUsage + " GB");
        System.out.println("Total Charge: Rs. " + charge);

        sc.close();
    }
}
// Assignment 02 - Question 10: Mobile Data Usage
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
        long mobileNumber = 9876543210L;
        double dataUsage = 7.5;

        double charge = calculateCharge(dataUsage);

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Data Usage: " + dataUsage + " GB");
        System.out.println("Total Data Charge: Rs. " + charge);
    }
}
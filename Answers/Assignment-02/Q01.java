// Assignment 02 - Question 01: Electricity Bill Calculation
public class Q01 {
    static double calculateBill(int units) {
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 2.0;
        } else if (units <= 200) {
            bill = (100 * 2.0) + ((units - 100) * 3.0);
        } else if (units <= 300) {
            bill = (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0);
        } else {
            bill = (100 * 2.0) + (100 * 3.0) + (100 * 5.0) + ((units - 300) * 7.0);
        }
        return bill;
    }

    public static void main(String[] args) {
        int units = 250;
        double totalBill = calculateBill(units);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Electricity Bill: Rs. " + totalBill);
    }
}
// Assignment 02 - Question 09: Bus Ticket Fare
public class Q09 {
    static double calculateFare(int age) {
        if (age < 5) {
            return 0.0;
        } else if (age <= 12) {
            return 20.0;
        } else if (age <= 59) {
            return 40.0;
        } else {
            return 25.0;
        }
    }

    public static void main(String[] args) {
        String passengerName = "Ramesh Kumar";
        int age = 65;

        double fare = calculateFare(age);

        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + age);
        System.out.println("Bus Ticket Fare: Rs. " + fare);
    }
}
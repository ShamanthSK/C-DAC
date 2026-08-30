// Assignment 02 - Question 07: Temperature Conversion
public class Q07 {
    static double convertTemperature(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        double celsius = 38.5;
        double fahrenheit = convertTemperature(celsius);

        System.out.println("Celsius Temperature: " + celsius + " deg C");
        System.out.println("Fahrenheit Temperature: " + fahrenheit + " deg F");

        if (fahrenheit > 100) {
            System.out.println("Warning: Temperature is above 100 deg F!");
        } else {
            System.out.println("Temperature is within normal limits.");
        }
    }
}
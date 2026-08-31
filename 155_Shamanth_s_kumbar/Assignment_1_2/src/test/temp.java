package test;
import java.util.*;
public class temp {
	
	
	public static double convertTemp(double celsius) {
		
		return (celsius * 9 / 5) + 32;
		
	}	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Degre in celsius");
        double celsius = sc.nextFloat();    
        double res = convertTemp(celsius);
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + res);
    }
}
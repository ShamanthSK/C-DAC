package test;
import java.util.*;
public class bus {
	public static String calculateFare(int age) {
		if(age<5) return "Free";
		else if (age>=5 && age<=12) return "₹20";
		else if (age>=13 && age<=59) return "₹40";
		else return "₹25";
	}	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of passenger : ");
		String name= sc.next();
		System.out.println("Enter the Age of passenger : ");
		int age= sc.nextInt();
		String fare=calculateFare(age);
		System.out.println("Passenger Details : ");
		System.out.print("name:  "+ name );
		System.out.println("");
		System.out.println("Age : "+ age);
		System.out.println("Fare :"+fare);		
	}
}
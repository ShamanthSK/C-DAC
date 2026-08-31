package test;
import java.util.*;
public class discount {
	public static double Productcal(double price) {
	
		if(price>=10000) return price-(price*0.2);
		else if(price>=5000 && price <= 9999) return price-(price*0.1);
		else if(price>=2000 && price <= 4999) return price-(price*0.05);
		else return price;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product ID : ");
		String pid = sc.next();
		System.out.println("Enter the product name :");
		String pname = sc.next();
		System.out.println("Enter the price (<2000 no discount) :");
		double price = sc.nextDouble();
		double res = Productcal(price);
		System.out.println("The product price after discount is: "+res);
	}
}

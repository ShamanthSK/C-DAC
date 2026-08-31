package test;
import java.util.*;
public class mobiledata {

	public static double calculateCharge(double data) {
		
		if(data<=1) return data*50;
		else if(data>1 && data<=5 ) return 1*50+(data-1)*100;
		else if(data>5 && data<=10) return 1*50+4*100+(data-5)*200;
		return 1*50+4*100+5*200+(data-10)*350;
		
}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the mobile number : ");
		long  number = sc.nextLong();
		System.out.println("");
		System.out.print("Enter the data usage in GB : ");
		double data = sc.nextDouble();
		System.out.println("");
		double charge = calculateCharge(data);
		System.out.println("Data usage charge for number : "+number+" is "+charge);


		 
	}
}

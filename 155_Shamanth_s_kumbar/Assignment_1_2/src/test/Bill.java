
package test;
import java.util.*;
public class Bill {
	
	public static double BillCal(double u) {
		
		if(u<=100) return u*2;
		else if(u<=200) return 100*2+(u-100)*3;
		else if(u<=300) return 100*2+100*3+(u-200)*5;
		else return 100*2+100*3+100*5+(u-300)*7;		
	}	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the units : ");
		double units = sc.nextDouble();
		double res = BillCal(units);
		System.out.println("Total Bill: "+res);
		
	}
}
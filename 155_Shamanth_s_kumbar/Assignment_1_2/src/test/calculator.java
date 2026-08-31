package test;
import java.util.*;
public class calculator {
	
	public static double calculate(double a,char op,double b) {
		if(op=='+') return a+b;
		else if(op=='-') return a-b;
		else if(op=='*') return a*b;
		else return a/b;
	}
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		double a=sc.nextDouble();
		System.out.println("Enter the Operator :");
		char op = sc.next().charAt(0);
		System.out.println("Enter the second number : ");
		double b=sc.nextDouble();
		double res = calculate(a,op,b);
		System.out.println(a+" "+op+" "+b+" is : "+res);

	}

}

package test;
import java.util.*;
public class EmpSal {
	
	public static double calculateSalary(double sal) {
		
		if(sal>=50000) return sal+sal*0.2;
		else return sal+sal*0.1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of employee : ");
		double sal = sc.nextDouble();
		double res = calculateSalary(sal);
		System.out.println("Salary of Employee after HRA : "+res);
		
		
	}
}

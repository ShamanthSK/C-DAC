package test;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of subject 1 :");
		int m1 = sc.nextInt();
		System.out.println("Enter the marks of subject 2 :");
		int m2 = sc.nextInt();
		System.out.println("Enter the marks of subject 3 :");
		int m3 = sc.nextInt();
		int sum = m1+m2+m3;
		double avg = sum/3;
		System.out.println("Sum is: "+sum);
		System.out.println("Avg is: "+avg);
	}
}
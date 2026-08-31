package test;

import java.util.Scanner;

public class pass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		float marks = sc.nextFloat();
		if(marks>=40 ) {
			System.out.println("Studnet is paased");		}
		else {
			System.out.println("STUDENT FAILED");

		}
}
}
package test;

import java.util.Scanner;
public class vote {
	public static String isEligible(int age) {
		if(age>=18 ) {
			return "Eligible to vote";
		}
		else {
			return "not Eligible to vote";

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		String res = isEligible(age);
		System.out.println(res);

}
} 
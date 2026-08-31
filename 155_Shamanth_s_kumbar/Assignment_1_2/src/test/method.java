package test;
import java.util.*;
public class method {
	public static String checkOddEven(int num) {
	    if (num % 2 == 0) {
	        return "Even";
	    } else {
	       return "odd";
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		String res = checkOddEven(n);
		System.out.println("Number is "+res);
		}
}

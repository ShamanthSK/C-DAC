package test;
import java.util.*;
public class Largest {
	
	
	public static int FindLargest(int a,int b) {
		if(a>b) return a;
		else if(a==b) return a;
		else return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		int res = FindLargest(a,b);
		System.out.println("The Largest of a and b is "+res);
	}
}

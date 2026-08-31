package test;
import java.util.*;
public class circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		float rad = sc.nextFloat();
		float pi=3.14f;
		float area = pi*rad*rad;
		float circum = 2*pi*rad;
		System.out.println("Circumference is: "+circum);
		System.out.println("Area is: "+area);
	}
}

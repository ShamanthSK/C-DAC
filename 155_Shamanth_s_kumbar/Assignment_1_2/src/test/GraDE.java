package test;
import java.util.*;
public class GraDE {
	
	public static String gradecal(int marks) {
		
		if(marks>=90) return "A";
		else if (marks>=75 && marks<= 89) return "B";
		else if (marks>=60 && marks<= 74) return "C";
		else if (marks>=50 && marks<= 59) return "D";
		else return "F";		
	}
	
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Marks : ");
	int marks = sc.nextInt();
	String res=gradecal(marks);	
	System.out.println(" Grade is : "+ res);
	}
}

package Program;
import java.util.*;
public class simpleCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		double a = sc.nextInt();
		System.out.println("Enter the operator : ");
		char op = sc.next().charAt(0);
		System.out.println("Enter the 2nd number : ");
		double b = sc.nextInt();
		double res = 0;
		switch(op) {
		
			case '+' :res = calOpearions.add(a, b);
					   System.out.println("Addition is : " + res);
					   break;
			case '-' : res = calOpearions.sub(a, b);
			System.out.println("subtracion is : " + res);
			 break;

			case '*' :  res = calOpearions.multi(a, b);
			System.out.println("Product is : " + res);
			 break;

			case '/' :  res = calOpearions.divi(a, b);
			System.out.println("Division is : " + res);
			 break;

			case '%' :  res = calOpearions.mod(a, b);
			System.out.println("remainder is : " + res);
			 break;
			 
			 default : System.out.println("Enter valid operator");
		}
		
	}
	
}

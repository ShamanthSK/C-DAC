package Program;
import java.util.*;
public class multiTable {

	public static int multiplication(int num , int i) {
		
		return num*i;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			int res = multiplication(num,i);
			System.out.println(num+" * "+i+" = "+res);
			
		}
		
	}
	
}

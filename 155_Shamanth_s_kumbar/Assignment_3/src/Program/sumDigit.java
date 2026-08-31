package Program;
import java.util.*;
public class sumDigit {
	
	public static long CalculateSum(long num) {
		
		long sum=0;
		long rem;
		while (num>0) {
			rem = num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
				
	}	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		long num = sc.nextLong();
		long sum =  CalculateSum(num);
		
		System.out.println("The sum of digit :"+num+ " is "+ sum );		
	}	
}
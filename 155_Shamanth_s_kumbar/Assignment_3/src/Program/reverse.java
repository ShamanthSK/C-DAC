package Program;
import java.util.*;
public class reverse {

	public static long reverseNumber(long num) {
		long rev=0;
		long rem;
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to rverse : ");
		long num = sc.nextLong();
		long rev = reverseNumber(num);
		System.out.println("Original number is : "+num);
		System.out.println("Reversed number is : "+rev);

	}
	
}

package Program;
import java.util.*;
public class evenodd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr = array.readArray(arr, n);
		int[] res = array.count(arr);
		System.out.println("total Even numbers are :"+res[0]);
		System.out.println("total Odd numbers are :"+res[1]);

				
		
	}
	
}

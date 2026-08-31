package Program;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		arr = array.readArray(arr, n);
		
		int[] res = array.findMinMax(arr, n);
		
		System.out.println("The maximum element in array is : "+res[0]);
		System.out.println("The minimum element in array is : "+res[1]);
		
	}
	
}

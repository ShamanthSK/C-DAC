package Program;
import java.util.*;
public class findElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		arr = array.readArray(arr, n);
		
		System.out.println("Enter element to search : ");
		int key = sc.nextInt();
		
		int pos = array.searchElement(arr, n, key);
		if(pos==-1) {
			
			System.out.println("Element "+key +" is not found in array");
			
		}
		else
		System.out.println("Element "+key+" is found at position "+pos);
		
	}
	
}

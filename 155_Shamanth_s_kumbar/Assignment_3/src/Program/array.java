package Program;
import java.util.*;
public class array {

	
	 static Scanner sc = new Scanner(System.in);
	
	public static int[] readArray(int[] arr,int n) {
		System.out.println("Enter "+n+" elements/marks to array");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		return arr;
		
	}
	
	public static void displayArray(int[] arr,int n) {
		
		System.out.println("Array elemets are : ");
		for(int i=0;i<n;i++) {
			
			System.out.println(arr[i]+" ");
			
		}
		
	}
	
	public static int[] findMinMax(int[] arr,int n) {
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1;i<n;i++) {
			
			if(arr[i]>max) max = arr[i];
			if(arr[i]<min) min = arr[i];
			
		}
		
		return new int[] {max,min};
		
	}
	
	
	public static int searchElement(int[] arr,int n,int key) {
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==key) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	
	public static int sum(int[] arr,int n) {
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			
			sum+=arr[i];
			
		}
		
		return sum;
	}
	
	
	public static int[] count(int[] arr) {
		
		int even=0,odd=0;
		for(int val:arr) {
			
			if(val%2==0) even++;
			else odd++;
			
		}
		
		return new int[]{even,odd};
		
	}
 	
}

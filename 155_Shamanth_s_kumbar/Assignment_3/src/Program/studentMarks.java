package Program;
import java.util.*;
public class studentMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr = array.readArray(arr, n);
		int totalMarks = array.sum(arr, n);
		double avg = totalMarks/n;
		int[] res = array.findMinMax(arr, n);
		
		System.out.println("Total marks of all students is : "+totalMarks);
		System.out.println("Average of class is : "+avg);
		System.out.println("Height marks among stduents is "+res[0]);
		System.out.println("Lowest marks among stduents is "+res[1]);

		
	}
	
}

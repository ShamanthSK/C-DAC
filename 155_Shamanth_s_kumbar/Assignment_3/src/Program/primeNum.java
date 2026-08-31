package Program;
import java.util.*;

public class primeNum{
	
	public static boolean prime(int n) {
		
		boolean isPrime = true;
		
		for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
		}            
            return isPrime;            		
        
	}
	
	
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            
       
            boolean isPrime = prime(num);
            
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
  
    }
}


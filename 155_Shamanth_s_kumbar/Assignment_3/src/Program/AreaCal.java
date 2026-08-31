package Program;
import java.util.*;
public class AreaCal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1.Area of circle");
			System.out.println("2.Area of reactangle");
			System.out.println("3.Area of triangle");
			System.out.println("4.exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			System.out.println("");
			double a ,b;
			double res;
			switch(ch) {
			
			case 1 :    System.out.print("Enter the radius : ");
						a = sc.nextDouble();
						res = Areas.circle(a);
						System.out.println("Area of cricle is  :"+res);
						break;
			
			case 2 : System.out.print("Enter the sides of reactangle : ");
						a = sc.nextDouble();
						b = sc.nextDouble();
						res = Areas.rectangle(a,b);
						System.out.println("Area of Rectangle is  :"+res);
						break;
			
			
			case 3 : System.out.print("Enter base and height of triangle : ");
						a = sc.nextDouble();
						b = sc.nextDouble();
						res = Areas.triangle(a,b);
						System.out.println("Area of Triangle is  :"+res);
						break;
			
			case 4 : System.out.println("Exiting from program......");
						System.exit(0);
						break;
			
			default:System.out.println("Enter valid choice ! ");
			
			
			}
			
		}
		
	}
	
}

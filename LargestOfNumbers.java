package largestOfNumbers;

/*program for input values from user  
1. largest of 2 numbers with ternary operators*/
import java.util.Scanner;
public class LargestOfNumbers {

	public static void main(String[] args) {
		
		int a;
		int b;
		int largest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b :");
		b = sc.nextInt();
		
		largest = (a > b)?a:b;
		
		System.out.println("the a is :" +a+ " and "+ "the b is :" +b+ ", " + "largest number is :" +largest);
		
		
//		2. minimum of 3 numbers
		System.out.println("\n minimum of 3 numbers");
		
		int d;
		int e;
		int f;
		int min;
		
		System.out.println("Enter the value of d: ");
		d = sc.nextInt();
		
		System.out.println("Enter the value of e: ");
		e = sc.nextInt();
		
		System.out.println("Eneter the value of f: ");
		f = sc.nextInt();
		
		min = (d < e && d < f)?d:(e < d && e < f )?e:f;
		
		System.out.println("the d is :" +d+ ", the e is : " +e+ ", the f is :" +f+ " and " + "Min Noumber : " +min);

		

	}

}

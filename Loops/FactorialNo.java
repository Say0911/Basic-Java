package loopPack;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int i, n;
	 double fact = 1;
		System.out.println("Enter the n value :");
		n = sc.nextInt();
		
		/*
		 * for(i = n; i>=1; i--) { fact *= i; }
		 * System.out.println("Factorial of the givein number " +n+   " is: " +fact)
		 */;
		 
		 i = n;
		 while(i >= 1) {
			 fact *= i;
			 i--;
		 }
		 System.out.println("Factorial of the givein number " +n+   " is: " +fact);
	}

}

package loopPack;

import java.util.Scanner;

//1. sum of numbers 1 to 50 numbers
//2. sum of natural no with the user inputs
//3. summ of even natural  no
//3. summ of odd natural  no
public class SumofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 1, sum = 0, n;
		/*
		 * while(s <= 50) { sum = sum + s; // sum= 0+1=1; sum = 1+2=3; so no s++; }
		 * System.out.println("the sum is: " +sum);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		n = sc.nextInt();
		
		/*
		 * while(s <= n) { sum = sum + s;
		 * 
		 * s++; } System.out.println("The sum is : " +sum);
		 */
		
		
		/*
		 * while(s <= n) { sum = sum + s;
		 * 
		 * s +=2; } System.out.println("The sum of even natural numbers is : " +sum);
		 */
		
		while(s <= n) {
			sum = sum + s;
			
			s +=2;
		}
		System.out.println("The sum of odd natural numbers is : " +sum);
	}

}

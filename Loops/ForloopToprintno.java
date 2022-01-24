package loopPack;

import java.util.Scanner;

/*Useing for loop prform following programs:
	1. print the sum of natural no with user input;
	2. print the sum of even natural no with users input;
	3. print the sum of odd natural no with user input;*/
public class ForloopToprintno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. print the sum of natural no with user input
		System.out.println( "1. print the sum of natural no with user input");
		int i, sum=0;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enterv the value of n: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			sum = sum + i;
			
		}
		System.out.println("The sum of n natural no is: " +sum);
		
//		2.print the sum of even natural no with users input
		System.out.println( "\n 2.print the sum of even natural no with users input");
		int j, sum1 = 0;
		int m;
		
		System.out.println("Enter the value of m: ");
		m = sc.nextInt();
		
		for(j = 2; j <= m; j += 2) {
			sum1 += j;
			
		}
		System.out.println("THe sum of all even natural no is: " +sum1);
		
		
//		3. print the sum of odd natural no with user input
		System.out.println("\n 3. print the sum of odd natural no with user input");
		int k, sum3 = 0;
		int o;
		System.out.println("Enter the value of o: ");
		o = sc.nextInt();
		
		for(k = 1; k <= o; k += 2) {
			sum3 += o;
			
		}
		System.out.println("THe sum of all odd natural no is: " +sum3);
				
				
	}

}

package packNested;

import java.util.Scanner;

/**
 * 5. find addition of the series using a loop 
 * 1. S = 1+1/2!+1/3!+1/4!=.........+1/n! 
 * 2. S = 1 -1/2! -1/3! -1/4!=.........-1/n!
 */
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n,fact1 =1, fact2= 1;
 double sum1 = 0, sum2 = 0;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the n value here : "); 
 n = sc.nextInt();
//  this is for the addition of first series
   for(int i = 1; i <=n; i++) {
	fact1 *= i ;  
	sum1 += 1.0/fact1;
   }
   System.out.println("the sum of given first series 1+1/2!+1/3!+...1/n! is : " +sum1);
// this is for the addition of second series
	for(int i = 1; i <= n; i++) {
		fact2 *= i;
		sum2= sum2 - 1.0/fact2;
	}
	 System.out.println("the sum of given first series 1 -1/2! -1/3!-..1/n! is : " +sum2);
	}

}

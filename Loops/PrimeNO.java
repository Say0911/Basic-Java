package loopPack;

import java.util.Scanner;

public class PrimeNO {
 public static void main(String args[]) {
//		2.  program to check the given number is prime number or not
		Scanner sc = new Scanner(System.in);
		int num, i, count = 0;
		System.out.println("Enter the Number here : ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			if(num % i==0) {
				 count = count+1;
			}
		}
			if(count == 2 && num == 2) {
					System.out.println(num+ " is a smallest prime no");
				
				}else if(count == 2 && num != 2) {
					System.out.println(num+ " is a prime no");
			}else {
				System.out.println(num+ " is not a prime no");
			}
		
		

 }
}

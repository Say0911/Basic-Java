package loopPack;

import java.util.Scanner;

//Write a program for give the sum of natural no of even and odd seprately
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, evenSum = 0, oddSum = 0;
		int n;
		
		System.out.println("Enter the n value: " );
			n = sc.nextInt();
			
			for(i = 1; i < n; i++) {
				if(i% 2 == 0) {
					evenSum += i;
				}else {
					oddSum +=i;
				}
			}
			System.out.println("The even sum is :" +evenSum);
			
			System.out.println("The odd sum is :" +oddSum);
			
	}

}

package loopPack;

import java.util.Scanner;

/*Program to reverse the given number using while loop
 * program to check the no is palindrome or no
ex- num = 387 reversnum = 783*/
/*1.no of the revers no 
ex- num 432 op- 4+3+2 or 2+3+4*/
public class ReversNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
				int num, digit;
				int rev = 0, sum = 0;
				
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		int num1= num;
		while(num > 0) { // 876 > 0 87 > 0 8 > 0  0 > 0 (false)
	
			digit = num%10; // 876%10 = 6 87%10 = 7 8%10 =8
			rev = rev * 10 + digit; // 0*10+6 = 6 rev = 0*10+7 =67
			sum = sum + digit;
//				System.out.print(digit); 
		
			num = num/10;
		}
		System.out.println("Reversed Number :" +rev);
		System.out.println("sum of digit is: " +sum);
		
		if(num1 == rev) {
			System.out.println(num1+ " is palindrome");
		}else {
			System.out.println(num1+ " is not palindrom");
		}
	}

}

package loopPack;

import java.util.Scanner;

/*
 * hw
 * 
 *1. program to check the given number is Armstrong number or not 
 * 153 = (1^3)+(5^3)+(3^3)
 *2.  program to check the given number is prime number or not
 * */
public class NumArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. program to check the given number is Armstrong number or not
int num;
int digit, backnum;
int sum = 0;
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the number is :");
	num =  sc.nextInt();
	backnum = num;
	
	while(num>0) {
		digit = num % 10; //153%10=3; 15%10=5; 1%10=1
		sum = sum+digit*digit*digit; //sum = 0+3*3*3=27; sum=27+125=152; sum= 152+1=153 
		num = num/10; //15 15/10=1; 1/10=0
	}
	
	if(sum == backnum) {
		System.out.println("the " +backnum+ " is armstrog number");
	}else {
		System.out.println("the " +backnum+ " is not armstrong number");
	}
	
}
	
}

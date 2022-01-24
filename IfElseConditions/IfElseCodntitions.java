package ifConditions;

import java.util.Scanner;

public class IfElseCodntitions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		1. Program to print even  or odd  number
		/*
		 * int num1;
		 * 
		 * System.out.println("Enter the number:"); num1 = in.nextInt();
		 * 
		 * if(num1 %2 == 0) { System.out.println(num1+ " is an even number"); }else {
		 * System.out.println(num1+ " is an odd numbers"); }
		 */
		
//		2.program to check wether the person is eligible for voting
		
		/*
		 * int age;
		 * 
		 * System.out.println("enter the you are age is :"); age = in.nextInt();
		 * 
		 * if(age >=18) { System.out.println("You are eligible for voting"); }else {
		 * System.out.println("You Are not eligible for voting"); }
		 */
	
//	3. Porgram to check wether the Nu,ber is Positive or negetive
		
		int num;
		
		System.out.println("Enter the number is:");
		num = in.nextInt();
		
		if(num > 0) {
			System.out.println(num+" Number is positive");
		}else {
			System.out.println(num+ " Number is Negative");
		}
	}

}

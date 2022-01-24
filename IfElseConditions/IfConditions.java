package ifConditions;

import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		1. Program to check wether the number is negitive or positive or nutral
		
		int num1;
		
		System.out.println("Enter the number is:");
		num1 = sc.nextInt();		
		if(num1 >0) {
			System.out.println(num1+ "is positive");
		}
		if(num1 <0) {
			System.out.println(num1+ "is negitive");
		}
		if(num1 == 0) {
			System.out.println(num1+ "is nutral");
		}
//	2. Program for Voting Eligibility
		int age;
		System.out.println("Enter yor Age is :");
		age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("You are Eligible for Voting");
		}
		
		if(age < 18) {
			System.out.println("You are not Eligible for Voting");
		}
		
		
//		3. program to Chcek wether the number is odd or even
		
		int num;
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+ "is even Number");
			
		}
		
		if(num%2 != 0) {
			System.out.println(num+ "is odd Number");
		}
		
		
	}

}

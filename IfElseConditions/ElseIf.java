package ifConditions;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);

		int num1 , num2, num3;
		System.out.println("Enter the first number is:");
		num1 = in.nextInt();
		
		System.out.println("Enter the second number is: ");
		num2 = in.nextInt();
		
		System.out.println("Enter the thired number is: ");
		num3 = in.nextInt();
		
//		1. To find largest of two numbers
		/*
		 * if(num1 > num2) { System.out.println(num1+ " Fisrt number is largest"); }else
		 * if(num2 > num1){ System.out.println(num2+ " Second number is largest"); }else
		 * { System.out.println("Both numbers are equal"); }
		 */
		
//		2. To Find the largest of 3 numbers
		if(num1 > num2 && num1 > num3) { 
			System.out.println(num1+ " Fisrt number is largest"); 
		}else if(num2 > num1 && num2 > num3){ 
			System.out.println(num2+ " Second number is largest");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3+ " Third number is largest");
			}else{ 
				System.out.println("Both numbers are equal"); }
		}
	}



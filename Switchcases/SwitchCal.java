package switchPack;

import java.util.Scanner;

// using switch case write a program to perform addition, subtraction, multiplication, and divison
/*input :enter 2 no of type float
choice from user:
	enter your choice
	1. Addition
	2. Subtraction
	3.Multiplication
	4. Division*/
public class SwitchCal {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int choice;
			float num1, num2;
			
			System.out.println("the choice are:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multipication");
			System.out.println(" 4. Division");
			
			
			System.out.println("Enter the Choice you want: ");
			choice = sc.nextInt();
			System.out.println("Enter the first no: ");
			num1 = sc.nextFloat();
			System.out.println("Enter the second no: ");
			num2 = sc.nextFloat();
					
			
			
			switch(choice) {
			case 1:
				float add = num1 + num2;
				System.out.println("first no is: " +num1+ " and second no is: " +num2+  ", The addition of two no is: " +add);
				break;
			case 2:
				float sub = num1 + num2;
				System.out.println("first no is: " +num1+ " and second no is: " +num2+ ", The subtraction of two no is: " +sub);
				break;
			case 3:
				float mul = num1 + num2;
				System.out.println("first no is: " +num1+ " and second no is: " +num2+ ", The multiplication of two no is: " +mul);
				break;
			case 4:
				float div = num1 + num2;
				System.out.println("first no is: " +num1+ " and second no is: " +num2+ ", The division of two no is: " +div);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
}


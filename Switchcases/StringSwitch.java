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
public class StringSwitch {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String Cname;
	;
			
			System.out.println("the courses avilable are:");
			System.out.println("Java");
			System.out.println("Oracal");
			System.out.println("Python");
			System.out.println("Webdesing");
			
			
			System.out.println("Enter the course you want: ");
			Cname = sc.next();
					
			
			
			switch(Cname) {
			case "Java":
			case "java":
				System.out.println("Congratulation! you choice java ");
				break;
			case "Oracal":
			case "oracal":
				System.out.println("Congratulation! you choice oracal ");
				break;
			case "Python":
			case "python":
				System.out.println("Congratulation! you choice Python ");
				break;
			case "Webdesing":
			case "webdesing":
				System.out.println("Congratulation! you choice webdesing ");
				break;
			default:
				System.out.println("Sorry! you have not choice any course yet");
			}
		}
}

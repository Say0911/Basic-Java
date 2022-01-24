package ifConditions;

import java.util.Scanner;

/*program to perform the following task
marks       Grade
90-100       A
60-89        B
40-59        C
0-39         D
other Values Invalid
marks -> user input */
public class NestedElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int marks;
		System.out.println("Enter the marks in % are:");
			marks = input.nextInt();
			
			if(marks >= 90 && marks <= 100) {
				System.out.println("Grade A");
			}else if(marks >= 60 && marks <= 89) {
				System.out.println("Grade B");
			}else if(marks >= 40 && marks <= 59) {
				System.out.println("Grade C");
			}else if(marks >= 0 && marks <= 39) {
				System.out.println("Grade D");
			}else {
				System.out.println("Invalid Input");
			}
	}

}

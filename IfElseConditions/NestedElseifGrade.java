package ifConditions;

import java.util.Scanner;

/*program to perform the following task
 Grade        marks 
   A         90-100
   B		 60-89
   C         40-59
   D         0-39
other Values Invalid
Grade -> user input */
public class NestedElseifGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
			char grade;
			System.out.println("Enter your grade is:");
			grade = SC.next().charAt(0);
			if(grade == 'A' || grade == 'a'){
				System.out.println("The marks are in between 90-100");
			}else if(grade == 'B' || grade == 'b'){
				System.out.println("The marks are in between 60-89");
			}else if(grade == 'C' || grade == 'c'){
				System.out.println("The marks are in between 40-59");
			}else if(grade == 'D' || grade == 'd'){
				System.out.println("The marks are in between 0-39");
			}else {
				System.out.println("The user input is invalid");
			}
	}

}

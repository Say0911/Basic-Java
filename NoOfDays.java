package anyPack;
//program input number of days and days convert into seconds
import java.util.Scanner;
public class NoOfDays {
	
	public static void main(String args[]) {
		
		int days;
		int InSec;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter The Number of Days: ");
		days = Input.nextInt();
		
		InSec = days*24*60*60;
		System.out.println("Total Seconds of the no of " +days+ ": " +InSec);
		
	}

}
/*
 *
 */
/*
program for input valuse from user 
1. largest of 2 numbers 
2. minimum of 3 numbers
3. calculate area of circle, triangle, reactangle
4. input 5 sub marks and name  find the average
5. input values from user perform addition, subtraction, multiplication, division and remender(int)*/
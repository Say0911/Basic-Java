package switchPack;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int day;
		System.out.println("Enter the no of the day is: ");
		day = sc.nextInt();
		
		switch(day) {
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wensday");
			break;
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid input");
		
		}
		
	}

}

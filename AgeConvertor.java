package ageConvertor;

/*Enter your age in years enter your name convert age in months age in days age
* in mints age in seconds*/
import java.util.Scanner;
public class AgeConvertor {
	
	public static void main(String args[]) {
		int age;
		String name;
		int ageInMonths;
		int ageInDays;
		int ageInMins;
		int ageInSeconds;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter your age is :");
		 age = input.nextInt();
		 
		 System.out.println("Enter your name is :");
		 name = input.next();
		 
		 
		 //Age in Months 
		 
		 System.out.println("\n Age in Months");
		 ageInMonths = 12 * age;
		 System.out.println("Your age in years is :" +age+ " and "+ "your age in Months is :" +ageInMonths);
		
		//Age in Days
		 
		 System.out.println("\n Age in Days");
		 ageInDays = 365 * age;
		 System.out.println("Your age in years is :" +age+ " and "+ "your age in days is :" +ageInDays);
		 
		 //Age in Minutes
		 
		 System.out.println("\n Age in Minutes");
		 ageInMins = 24*60*ageInDays* age;
		 System.out.println("Your age in years is :" +age+ " and "+ "your age in minutes is :" +ageInMins);
		 
		 //Age in Seconds
		 
		 System.out.println("\n Age in Seconds");
		 ageInSeconds = 60*ageInMins*age;
		 System.out.println("Your age in years is :" +age+ " and "+ "your age in seconds is :" +ageInSeconds);
		 
		
		
	}

}

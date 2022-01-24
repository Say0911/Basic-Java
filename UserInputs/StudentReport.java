package packUserInput;

import java.util.Scanner;

/*program for input valuse from user
4. input 5 sub marks and name  find the average*/
public class StudentReport {
public static void main(String[] args) {
	

	Scanner SC = new Scanner(System.in);
	
	String StudentName;
	int maths;
	int science;
	int marathi;
	int english;
	int hindi;
	int avgOfMarks;
	System.out.println("Enter the Student Name:");
	StudentName = SC.nextLine(); 
	System.out.println("Enter the maths marks:");
	maths = SC.nextInt();
	System.out.println("Enter the science marks:");
	science = SC.nextInt();
	System.out.println("Enter the marathi marks:");
	marathi = SC.nextInt();
	System.out.println("Enter the english marks:");
	english = SC.nextInt();
	System.out.println("Enter the hindi marks:");
	hindi = SC.nextInt();
	
	avgOfMarks = (maths + science + marathi + english + hindi)/5;
	
	System.out.println("Student name is : " +StudentName);
	System.out.println("maths marks is: " +maths+ ", science marks is: " +science+ ", marathi marks is: "+marathi+  ", english marks is: "+english+  ", hindi marks is: "+hindi+  " and total marks are : "+avgOfMarks);
}	

}

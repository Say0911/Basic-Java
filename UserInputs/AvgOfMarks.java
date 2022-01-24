package packUserInput;
import java.util.Scanner;
public class AvgOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int maths, marathi,english, hindi, history, totalMarks;
		String name;
		
		System.out.println("enter your full name is: ");
		name = in.nextLine();
		System.out.println("Enter the marks of maths: ");
		maths = in.nextInt();
		System.out.println("Enter the marks of english: ");
		english = in.nextInt();
		System.out.println("Enter the marks of marathi: ");
		marathi = in.nextInt();
		System.out.println("Enter the marks of hindi: ");
		hindi = in.nextInt();
		System.out.println("Enter the marks of history: ");
		history = in.nextInt();
		
		totalMarks =( maths + marathi + english + hindi + history)/5;
		
		System.out.println("Student full name is: "+name);
		System.out.println("marks of maths are: " +maths+ ", marks of marathi are: " +marathi+ ", marks of english are: " +english+ ", marks of hindi are: " +hindi+ ", marks of history are: " +history+ "  and Total marks of all subjects are: " +totalMarks  );

	}

}

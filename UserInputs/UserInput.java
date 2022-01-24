package packUserInput;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		String Name;
		int age;
		float Fees;
		char Gen;
		double Loan;
		
		
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter Your age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your name: ");
		
		Name = sc.nextLine();
		
		System.out.println("Enter Your fees: ");
		Fees = sc.nextFloat();
		
		System.out.println("Enter Your Gender M/F: ");
		Gen = sc.next().charAt(0);
		
		System.out.println("Enter Your loan amount: ");
		Loan = sc.nextDouble();
		
		
		System.out.println("Enter Your name: " +Name);
		System.out.println("Enter Your loan age: " +age);
		System.out.println("Enter Your loan fees: " +Fees);
		System.out.println("Enter Your loan Gender: " +Gen);
		System.out.println("Enter Your loan loan: " +Loan);
	}

}

package packUserInput;
//5. input values from user perform addition, subtraction, multiplication, division and remender(int)*/
import java.util.Scanner;

public class ArthemathicOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int num1, num2 ,sum,sub,mul, div, mod;
		
		System.out.println("Enter the first no:");
		num1 = sc.nextInt();
		System.out.println("Enter the second no:");
		num2 = sc.nextInt();
		
//		1.Addition
		
		sum =  num1 + num2;
		System.out.println("first number is: " +num1+ ", second number is: " +num2+ " and addition of two number is :" +sum);
	
//		2. Subtraction
		
		sub =  num1 - num2;
		System.out.println("first number is: " +num1+ ", second number is: " +num2+ " and subtraction of two number is :" +sub);
	
//		3. Multiplication
		
		mul =  num1 * num2;
		System.out.println("first number is: " +num1+ ", second number is: " +num2+ " and multiplication of two number is :" +mul);
	
		
//		4. Division
		
		div =  num1 / num2;
		System.out.println("first number is: " +num1+ ", second number is: " +num2+ " and division of two number is :" +div);
	
//		5. Remender
		
		mod =  num1 % num2;
		System.out.println("first number is: " +num1+ ", second number is: " +num2+ " and remender of two number is :" +mod);
	
	
	
	}

}

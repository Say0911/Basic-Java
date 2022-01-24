package switchPack;

import java.util.Scanner;

public class SwitchEorO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number is:" );
		 num = sc.nextInt();
switch(num%2) {
case 0:
	 System.out.println(num+ " is even number");
	 break;
case 1:
	System.out.println( num+" is odd number");
	break;
}
	}

}

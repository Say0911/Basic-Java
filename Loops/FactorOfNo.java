package loopPack;

import java.util.Scanner;

public class FactorOfNo {

	public static void main(String[] args) {
		
		int num, i, sum = 0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the Number :");
				num = sc.nextInt();
				System.out.println("Factor of " +num+ " are");
			for(i=1; i<=num; i++) {
				if(num % i ==0) {
					System.out.print(i+ ",");
				 sum = sum+i;
				}
				
	}
		System.out.println("\n sum of factors of " +num+ " is :" +sum);
}

}

package packNested;

import java.util.Scanner;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		n = sc.nextInt();
	for(i = 1; i <= n; i++) {
		for(j = n-i; j >= 0; j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}

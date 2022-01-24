package packNested;

import java.util.Scanner;

public class InvertedLefTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows are : ");
		n = sc.nextInt();
		for(i = n; i >=1; i--) {
			for(j= 2*(n-i); j > 0; j--) {
				System.out.print(" ");
			}
			for( j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

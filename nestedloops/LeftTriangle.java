package packNested;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		row = sc.nextInt();
		for(i = 0; i < row; i++) {
				for(j = 2*(row-i); j >= 0; j--) {
					System.out.print(" ");
				}
				for(j = 0; j <= i; j++) {
					System.out.print(" *");
				
			}
			System.out.println();
		}
	}
}



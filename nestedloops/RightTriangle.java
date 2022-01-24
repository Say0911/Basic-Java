package packNested;

import java.util.Scanner;

//Right triagle with *
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		row = sc.nextInt();
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}

package packNested;

import java.util.Scanner;

public class InveredPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the rows are : ");
		row = sc.nextInt();
		for(i = row; i >= 0; i--) {
			for(j = row-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

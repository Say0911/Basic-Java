package arrPak;

import java.util.Scanner;

public class Intput2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		int a[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows :  ");
			r = sc.nextInt();
		System.out.println("Enetre the no of colunmes : ");
		c =  sc.nextInt();

System.out.println("Enter the matrix : ");

a = new int [r][c];
for(int i =0; i<r; i++) {
	for(int j = 0; j<c; j++ ) {
		a[i][j] = sc.nextInt();
	}
}


for(int i =0; i<r; i++) {
	for(int j = 0; j<c; j++ ) {
		System.out.print(a[i][j]+ " ");
}
	System.out.println("");
	}

	}
}

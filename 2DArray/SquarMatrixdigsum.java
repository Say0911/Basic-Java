package arrPak;
import java.util.Scanner;
public class SquarMatrixdigsum {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int r;
			int a[][];
			int sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no of rows and columes :  ");
				r = sc.nextInt();

	System.out.println("Enter the matrix : ");

	a = new int [r][r];
	for(int i =0; i<r; i++) {
		for(int j = 0; j<r; j++ ) {
			a[i][j] = sc.nextInt();
		}
	}


	for(int i =0; i<r; i++) {
		for(int j = 0; j<r; j++ ) {
			System.out.print(a[i][j]+ " ");
	}
		System.out.println("");
		}
	for(int i =0; i<r; i++) {
		for(int j =0; j <r; j++) {
			if(a[i] == a[j]){
				sum = sum + a[i][j];
			}
		}
	}
	System.out.println("The sum of the diganol is :" +sum);
	

		}
	}


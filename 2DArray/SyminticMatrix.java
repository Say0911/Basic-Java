package arrPak;

import java.util.Scanner;

public class SyminticMatrix {

public static void main(String args[]) {
	int A[][];
	int A1[][];
	int r,c;
	int B[][];
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows size for the matrix :");
	r = sc.nextInt();
	
	System.out.println("Enter the colunms for the matrix :");
	c = sc.nextInt();
	A = new int[r][c];
	A1 = new int[r][c];
	B = new int[r][c];
	
	
//	Check wether the matrix is having the same rows and colunms or not 
	
	if(r != c) {
		System.out.println("Transpose of matrix is not possible :");
	}else {
	System.out.println(" Transpose of matrix is possible");
	
//	Take the elements for the Matrix 
	System.out.println("Enter the element for matrix");
	for(int i = 0; i < r; i++) {
		for(int j = 0; j < c; j++) {
			A[i][j] = sc.nextInt();
			A1[i][j] = A[i][j];
				}
			}
//	Take the transpose of matrix
	 	for(int i = 0; i < r; i++) {
	 		for(int j = 0; j <c; j++) {
	 			B[j][i] = A[i][j];
	 		}
	 	}
	 	boolean flag = true;
	 
//	 	Print the Transpose of Matrix 
	 	System.out.println("The Transpose of matrix is : ");
	 	for(int i = 0; i< r; i++) {
	 		for(int j = 0; j < c; j++) {
	 			System.out.print(B[i][j]+ " ");
	 		}
	 		System.out.println(" ");
	 	}
	 	
//	 Check whetar the matrix is symintric or not 
		for(int i = 0; i < r; i++) {
	 		for(int j = 0; j <c; j++) {
	 			if(A1[i][j] != B[i][j]) {
	 				flag = false;
	 				break;
	 			}
	 		}
	 	}
		if(flag == true) {
			System.out.println("The matrix is symintic matrix");
		}else {
			System.out.println("THe matrix is not a symintic matrix");
		}
	 	
	 	
	}
	
	}

}

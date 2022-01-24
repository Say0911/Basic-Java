package arrPak;

import java.util.Scanner;

public class SubtractionOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r1,c1;
		int r2, c2;
		int arr1[][];
		int arr2[][];
		int arr3[][];
		
//		Take the row and column size for both the array from user
		// Get the row and column size value for first array
		System.out.println("Enter the first array row size : ");
		r1 = sc.nextInt();
		System.out.println("Enter the first array column size : ");
		c1 = sc.nextInt();
		
		
		// Get the row and column size value for second array
		System.out.println("Enter the second array row size : ");
		r2 = sc.nextInt();
		System.out.println("Enter the second array column size : ");
		c2 = sc.nextInt();
		
		
		
		// checking the condition for subtraction of matrices
		if(r1 != r2 || c1 != c2 || r1 == 0 || r2 == 0 || c1 == 0 || c2 == 0 || r1 < 0 || r2 < 0 || c1 < 0 || c2 < 0){
			System.out.println("Subtraction of matrices is not possible");
			
		}else {
			System.out.println("Subtraction of matrices is possible ");
		
		arr1 = new int[r1][c1];
		arr2 = new int[r2][c2];
		arr3 = new int[r1][c1];
		
		
		// Tacking the elements for first matrix from user
		System.out.println("Enter the elements fro first array");
		for(int i = 0; i < r1; i++){
			for(int j =0; j <c1; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		
		// Tacking the elements for second matrix from user
		System.out.println("Enter the elements fro second array");
			for(int i = 0; i < r2; i++){
				for(int j = 0; j < c2; j++){
					arr2[i][j] = sc.nextInt();
				}
			}
//		Subtracting second matrix from first matrix and storing it in third matrix
		
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				arr3[i][j] = arr1[i][j] - arr2[i][j];
				}
			}
		
		
		//Printing the result of subtraction is
		 System.out.println("Subtraction of two matrix is : ");
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c1; j++) {
					System.out.print(arr3[i][j]+ " ");
				}
				System.out.println();
			}
			
		}
		
	}

}

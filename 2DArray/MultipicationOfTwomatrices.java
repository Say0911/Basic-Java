package arrPak;

import java.util.Scanner;

/*Program to find the multiplication of two arrays*/ 
public class MultipicationOfTwomatrices {

	public static void main(String[] args) {
		int r1, r2;
		int c1, c2;
		int a[][];
		int b[][];
		int c[][];
		int s =1;
		for(;;) {
			System.out.println(s);
			s++;
			if(s == 100) {
				break;
			}
			System.out.println(s);
		}
		
		Scanner sc = new Scanner(System.in);
		 // Tacking the user values for rows and columns for first matrix
		System.out.println("Enter the row size for first matrix : ");
		r1 = sc.nextInt();
		System.out.println("Enter the column for first matrix : ");
		c1 = sc.nextInt();
		
		System.out.println("Enter the row size for second martix : ");
		r2 = sc.nextInt();
		System.out.println("Enter the column size for second martix : ");
		c2 = sc.nextInt();
		
		if(c1 != r2) {
			System.out.println("Multipication is not possible ");
		}else {
			System.out.println("Multiplication is possible");
			
			a = new int[r1][c1];
			b = new int[r2][c2];
			c = new int[r2][c2];
			
//			Tack first array elements from user
			System.out.println("Enter the elemnts for first array is : ");
			for(int i= 0; i < r1; i++) {
				for(int j = 0; j < c1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter the elemnts for second array is : ");
			for(int i = 0; i < r2; i++) {
				for(int j = 0; j < c2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
//			do multipication of two matrics and store the value in the an other array
			for(int i = 0; i < r1; i++) {
				for(int j = 0; j < c2; j++){
						c[i][j] = 0;	
				for(int k =0; k < c1; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				}
				
			}
		
//		Viewing the result 
			System.out.println("The multiplication of two matrices is : ");
			for(int i = 0; i < r2; i++){
				for(int j =0; j < c2; j++) {
					System.out.print(c[i][j]+ " ");
				}
				System.out.println();
			}
		
		}
		
		
	}

}

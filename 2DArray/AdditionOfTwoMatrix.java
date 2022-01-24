package arrPak;

import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int r1, c1;
  int r2, c2;
  int a[][];
  int b[][];
  int c[][];
  // geting user values for first martix row and comlunms
  System.out.println("Enter the rows and colunms for first matrix : ");
  System.out.println("Enter the rows of the first matrix :");
  r1 = sc.nextInt();
  System.out.println("Enter the colunms of the first matrix : " );
  c1 = sc.nextInt();
 
  // geting user values for second martix row and comlunms
  System.out.println("Enter the rows and colunms for second matrix : ");
  System.out.println("ENter the row of second matrix :");
  r2 = sc.nextInt();
  System.out.println("Enter the columns of second matrix : ");
  c2 = sc.nextInt();
 
  
  
  
  //Cheking wether the condition is match for addition of two matrices 
  if(r1 != r2 || c1 != c2 || r1 == 0 || r2 == 0 || c1 == 0 || c2 == 0 || r1 < 0 || r2 < 0 || c1 < 0 || c2 < 0 ) {
		System.out.println("Addition of two matrix is not  possible!");		
	}else{
		System.out.println("Addition of two matrix is possible");
		  a = new int[r1][c1];
		  b = new int [r2][c2];
		  c = new int[r1][c1];
		
  
 
 //tacking elements form user for first matrix 
  System.out.println("Enter the matrix " +r1+ " and "+c1+ " is :");
  for(int i = 0; i < r1; i++) {
	  for(int j = 0; j <c1; j++) {
		  a[i][j] = sc.nextInt();
		 
	  }
  }
  

  
  //tacking elements form user for sedcond matrix 
  System.out.println("Enter the matrix " +r2+ " and "+c2+ " is :");
  for(int i=0; i < r2; i++) {
	  for(int j =0; j < c2; j++) {
		  b[i][j] = sc.nextInt();
	  }
  }
  
 
	
	
//	Adding the two metrices 
	for(int i = 0; i < r1; i++) {
		for(int j = 0; j < c1; j++) {
			c[i][j] = a[i][j] + b[i][j];
		}
	}
	System.out.println("First matrix is : ");
	  for(int i = 0; i < r1; i++) {
		  for(int j = 0; j <c1; j++) {
			  System.out.print(a[i][j]+ " ");
		  }
		  System.out.println("");
	  }
	  System.out.println("Sedond matrix is : ");
	  for(int i =0; i < r2; i++) {
		  for(int j = 0; j < c2; j++) {
			  System.out.print(b[i][j]+ " ");
		  }
		  System.out.println("");
	  }
	
	System.out.println("The addition of the tow matrix is  :");
	for(int i = 0; i < r1; i++) {
		for(int j = 0; j < c1; j++) {
			System.out.print(c[i][j]+ " ");
		}
		System.out.println(" ");
	}
}

}
}

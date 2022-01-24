package arrPack;

import java.util.Scanner;
//3. inster in the array to a position 
//4. delete element from array
// 2. find out how many time the key value is present in the array.
public class LinerarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array is : ");
		int n =sc.nextInt();
		a = new int[n];
		System.out.println("Enter the array elements are : ");
		for(int i = 0; i < n; i++) {
		a[i] = sc.nextInt(); 
		}
		 System.out.println("Enter the key value : ");
		 int key = sc.nextInt();
		 int c=0;
		 for(int i = 0; i <= a.length; i++) {
			 if(a[i] == key){
				 c = i+1;
				 break;
				 
			 }
			 
		 }
		 System.out.println("Array element is "+c );
	}
	
}

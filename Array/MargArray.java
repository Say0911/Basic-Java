package arrPack;

import java.util.Scanner;

//Marage two array in the thired array
public class MargArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1;
		int []arr2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array : ");
		int a1 = sc.nextInt();
		arr1 = new int[a1];
		System.out.println("Enter the first array elements are : ");
		for(int i =0; i< a1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the length of second array ");
		int a2 = sc.nextInt();
		arr2 = new int[a2];
		System.out.println("Enter the second array elements are : ");
		for(int i = 0; i < a2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		
		a1 =  arr1.length;
		a2 = arr2.length;
		
		int a3 = a1 + a2;
		int []arr3 = new int[a3];
				for(int i =0; i < a1; i++) {
					arr3[i] = arr1[i];
				}
				for(int i = 0; i < a2; i++){
					arr3[a1 + i] = arr2[i];
				}
				
				System.out.println("The marge array is : ");
				 System.out.print("{"); 
				 for(int i = 0; i < a3; i++) {
					 if(i <= arr3.length-2) {
				 System.out.print(arr3[i]+ ","); 
				 }else if(i == arr3.length-1) {
				  System.out.print(arr3[i]); }
				  }
				 System.out.print("}");
				 
				
				
				System.out.println();
				int k = 0;
				outer:
					for(int i = 0; i < a3; i++) {
						inner:
							for(int j =0; j < i; j++) {
								if(arr3[i] == arr3[j]) {
									continue outer;
								}
							}
						k++;
					}
				
				
				int arr4 [] = new int[k];
				int m =0;
				outer:
					for(int i = 0; i < a3; i++) {
						inner:
							for(int j = 0; j < i; j++) {
								if(arr3[i] == arr3[j]) {
									continue outer;
								}
							}
					arr4[m] = arr3[i];
					m++;
					}
			System.out.println("After removing duplicates marge array is :");
			System.out.print("{");
			for(int i = 0; i < k; i++) {
				if(i <= k-2) {
					
				
				System.out.print(arr4[i]+",");
				}else if(i == k-1) {
					System.out.print(arr4[i]);
				}
			}
			System.out.print("}");
			
						
	}
	
}

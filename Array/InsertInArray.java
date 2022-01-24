package arrPack;

import java.util.Scanner;

public class InsertInArray {

	public static void main(String[] args) {
		 int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n =sc.nextInt();
		arr = new int [n];
		System.out.println("Enter the array elements here :");
		for(int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The given array is :");
		System.out.print("{");
		for(int i = 0; i< n; i++) {
			if(i <= arr.length-2) {
				System.out.print(arr[i]+",");
			}else if(i == arr.length-1) {
				System.out.print(arr[i]+"");
			}
		}
		System.out.print("}");
		System.out.println();
		
		System.out.println("Enter the element to be entered : ");
		
		int x = sc.nextInt();
		
		System.out.println("Enter thr position where you want to insert element : ");
			int pos =sc.nextInt();
			
//			int arr1[] = new int[n+1];
			for(int i = n-1; i >= pos; i--) {
				arr[i+1] = arr[i];
			}
			arr[pos] = x;
			System.out.println("The updatede array is :");
			System.out.print("{");
			for(int i = 0; i< n; i++) {
				if(i <= arr.length-2) {
					System.out.print(arr[i]+",");
				}else if(i == arr.length-1) {
					System.out.print(arr[i]+"");
				}
			}
			System.out.print("}");
	}

}

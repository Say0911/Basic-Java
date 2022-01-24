package arrPack;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[];
		int m;
		// Take the array length and array elements from user
		System.out.println("Enter the length of array : ");
		m = sc.nextInt();
		arr = new int[m];
		System.out.println("Enter the array elemamts ");
		for(int i =0; i < m; i++) {
			arr[i] = sc.nextInt();
			}
//		print the user define array 
		System.out.println("The array is : ");
		System.out.print("{");
		for(int i =0; i < m; i++){
			if(i <= arr.length-2) {
			System.out.print(arr[i]+ ", ");
		}else if(i == arr.length-1) {
			System.out.print(arr[i]+ " ");
		}
			}
		
		System.out.print("}");
//	 Sort the array with bubble Sort
	for(int i =0; i < m-1; i++) {
		for(int j = 0; j < m-i-1; j++) {
			if(arr[j] > arr[j+1]){
				int c = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =c;
			}
		}
	}
	
//	Print the sorted array 
		System.out.println("\n The sorted array is : ");
		System.out.print("{");
		for(int j = 0; j <m; j++) {
			if(j <= arr.length-2) {
				System.out.print(arr[j]+ ",");
			}else if(j == arr.length-1) {
				System.out.print(arr[j]+" ");
			}
			}
		System.out.print("}");
		}
	}


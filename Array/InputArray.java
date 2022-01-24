package arrPack;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i = 0;  i < n; i++) {
		arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		System.out.print("{");
		for(int i = 0; i <=n; i++) {
				if(i <= arr.length-2) {
				System.out.print(arr[i]+",");
				}else if(i == arr.length-1) {
					System.out.print(arr[i]);
				}
			}
			System.out.println("}");
	}

}

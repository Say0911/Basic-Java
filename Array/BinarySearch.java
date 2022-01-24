package arrPack;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		a = new int[n];
		
		System.out.println("Enter the elements in asending order :");
		for(int i=0; i < a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element to be serach : ");
		int key = sc.nextInt();
		int l =0;
		int h =n-1;
		int mid =0;
		int pos =0;
		while(l<h) {
			mid = (l+h)/2;
		 if(key == a[mid]) {
			 pos = mid +1;
			 break;
		 }else if(key<a[mid]) {
			 h = mid-1;
		 }else if(key>a[mid]) {
			 l=mid+1;
		 }
		}
		if(pos>0) {
			System.out.println("Successful search");
			System.out.println(key+ "found at postion " +pos);
		}else {
			System.out.println("Unsuccessful search");
		}
	}

}

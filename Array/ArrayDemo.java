package arrPack;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and initialize array
		int arr[] = {4,5,7,8,9}; //4*5 = 20bytes
		/*
		 * System.out.println("first array elements : "+arr[0] );
		 * System.out.println("second array elements : "+arr[1] );
		 * System.out.println("third array elements : "+arr[2] );
		 * System.out.println("fourth array elements : "+arr[3] );
		 * System.out.println("fifth array elements : "+arr[4] );
		 */
		
		System.out.println("Number of element in a array" +arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
			
		}
		//sum of all array elements 
		
		int sum= 0;
		for(int i = 0; i<arr.length; i++){
		sum =sum + arr[i];
		}
		System.out.println("the sum of the array elements is :" +sum);
//		 avreage og the array elements
		 float avg = ((float)sum/arr.length);
		 System.out.println("Average : " +avg);
		 
//		 Largest of 5 no in array
		 int max = arr[0];
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i] > max) {
				 max =arr[i];
			 }
		 }
System.out.println("Largest of all arrays are : "+max);

//	 Smallest of 5 no in array
	 int min = arr[0];
	 for(int i =0; i<arr.length;i++) {
		 if(arr[i] < min) {
			 min =arr[i];
		 }
	 }
System.out.println("Largest of all arrays are : "+min);
}

}

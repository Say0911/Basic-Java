package packOprators;

public class AllOprators {

	public static void main(String[] args) {
//		boolean
		int a= 5, b = 3;
		boolean c;
		c = a < b;
		System.out.println(c);
		c = a > b;
		System.out.println(c);
		c = a<=b;
		System.out.println(c);
		c = a >= b;
		System.out.println(c);
//		assingment 
		int i= 6;
		i += 1;
		System.out.println(i);
		int j = 9;
		j-= 2;
		System.out.println(j);
		int t=10;
		 t *= 3;
		System.out.println(t);
		int f =12;
		f /= 2;
		System.out.println(f);
		
		int h = 90;
		h %= 4;
		System.out.println(h);
		
	// Ternary Oprators with largest of numbers
		
		int s =3, q = 9, p = 12, k = 8, m = 7;
		int largest;
//		Largest of two numbers
		System.out.println("\n Largest of two numbers");
		largest = (s > q)?s:q;
		System.out.println("s is : " +s+ " and " + "q is: " +q+ " largest is : "+largest );
		
//		Largest of three number
		System.out.println("\n Largest of three numbers");
		largest = (s > q && s > p)? s :(q > s && q > p)? q :p;
		System.out.println("s is : " +s+  ", q is: " +q+ ", p is: " +p+  " and " + " largest is : "+largest);
		
//		Largest of four number
		System.out.println("\n Largest of four numbers");
		largest = (s > q && s > p && s > k)? s :(q > s && q > p && q > k)? q :(p > s && p > q && p > k)?p: k;
		System.out.println("s is : " +s+  ", q is: " +q+ ", p is: " +p+ ", k is: " +k+ " and " + " largest is : "+largest);
	
		
		
//		Largest of five number
		System.out.println("\n Largest of five numbers");
		largest = (s > q && s > p && s > k && s > m)? s :(q > s && q > p && q > k && q > m)? q :(p > s && p > q && p > k && p > m)?p:(k > s && k > q && k > p && k > m)? k :m;
		System.out.println("s is : " +s+  ", q is: " +q+ ", p is: " +p+ ", k is: " +k+  ", m is: " +m+ " and " + " largest is : "+largest);
	}

}

package packVar;

public class varableDemo {
	public static void main(String args[]) {
		/*
		 * int a=3; float b= 3.3f; double c = 67.909090 ; char e = 'S';
		 */
		 int f =8, h=3 ,p, q, r ,s ,e ;
		 float c;
	
			/*
			 * System.out.println(a); System.out.println(b); System.out.println(c);
			 * System.out.println(e);
			 */
	
	
	//increment nad dicrement 
	
			p = f + h;
			q = f-h;
			r = f*h;
			s = f/h;
			e = f%h;  
			c = f/h;
			System.out.println("p =" +p);
			System.out.println("q =" +q);
			System.out.println("r =" +r);
			System.out.println("s =" +s);
			System.out.println("e =" +e);
			System.out.println("c =" +c);

			
	
	int num = 23434;
	int di;
	
	/*
	 * di = num%10; System.out.print(di); num = num/10; di = num%10;
	 * System.out.print(di);
	 * 
	 * num = num/10; di = num%10; System.out.print(di); num = num/10;
	 * 
	 * di = num%10; System.out.print(di); num = num/10;
	 * 
	 * di = num%10; System.out.print(di); num = num/10;
	 */
	
	
	for(int i =0; i<5; i++) {
		di=num%10;
		System.out.print(di);
		num = num/10;
	}
	
	
	
	}

}

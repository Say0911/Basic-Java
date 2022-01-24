package loopPack;

public class TribonacciSeries {

	public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int c = 2;
	int s = 0;
	System.out.print(a+ " "+b+ " "+c+" ");
	for(int i = 3; i < 10; ++i) {
		s = a+b+c;
		if(s > 100) {
			break;
			}
		System.out.print(s+" ");
		a = b;
		b = c;
		c = s;
		
		
		
		
	}
	}

}

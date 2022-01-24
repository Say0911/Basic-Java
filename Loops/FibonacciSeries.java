package loopPack;

/*Fibonacci Series 
int value 0 1;
print 0 1 1 2 3  5 8 13 21 24 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+ " ");
		System.out.print(b+ " ");
for(int i = 2; i< 10; ++i) {
	c = a + b;
	System.out.print(" " +c);
	a = b;
	b = c;
}
	}

}

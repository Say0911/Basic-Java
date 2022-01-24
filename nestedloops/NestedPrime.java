package packNested;

/*Check the prime no with nested loop between 1 to 100
 * */
public class NestedPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, c= 0;
		for(i = 1; i <= 100; i++) {
			c = 0;
			for( j = 1; j <= i; j++ ) {
				if(i%j == 0) {
					c++;
				}
			}
			if(c == 2) {
				System.out.print(i+ " ");
			}
		}
	}

}

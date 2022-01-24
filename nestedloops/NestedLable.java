package packNested;

public class NestedLable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
outer:
	for(i = 1; i <= 5; i++) {
		inner:
			for(j = 1; j <= 5; j++) {
				
				if(j == 3) {
				break inner;
				}else {
					System.out.println("i = " +i+ ", j = "+j);
				}
			}
		System.out.println();
		}
	}

}
/*
 * 1. all pattern program 
 * 2. Check the prime no with nested loop between 1 to 100
 */
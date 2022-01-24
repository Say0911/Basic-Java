package packNested;
//2.check the pime no from user input staring vale and ending value 
import java.util.Scanner;

public class NestedPrimeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sn,en, c = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Starting no : ");
		sn = sc.nextInt();
		System.out.println("Enter the ending no : ");
		en = sc.nextInt();
		for(i = sn; i <= en; i++) {
			c = 0;
			for(j = 1; j <= i; j++) {
			if(i%j == 0) {
				c++;
			}
		}
			if(c == 2) {
				System.out.print(i+ ", ");
			}
		}
	}

}

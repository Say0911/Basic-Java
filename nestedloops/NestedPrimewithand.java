package packNested;

import java.util.Scanner;

/*3. prime no with the and, or opretor
  * 4. prime no with break or continte
  */
public class NestedPrimewithand {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i,j,sn,en, c = 0;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the Starting no : ");
			sn = sc.nextInt();
			System.out.println("Enter the ending no : ");
			en = sc.nextInt();
			for(i = sn; i <= en; i++) {
				if(i == 1 || i == 0) {
					continue;
				}
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


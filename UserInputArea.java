package packArea;
/*program for input valuse from user 
3. calculate area of circle, triangle, reactangle*/
import java.util.Scanner;
public class UserInputArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
//			Area of Circle 
			System.out.println("\n Area Of Circle:");
			 int r;
			 int pay = 22/7;
			 int AreaOfCircle;
			 
			 System.out.println("Enter the Redius of circle is :" );
			 r = in.nextInt();
			
			 AreaOfCircle = pay*r*r;
			 System.out.println("Redius of circle is :" +r+ " and " + "Area of Circle is :" +AreaOfCircle);
			 
			 
//				Area of triangle 
				System.out.println("\n Area Of triangle:");
				 int b;
				 int h;
				 int AreaOfTriangle;
				 
				 System.out.println("Enter the Base of Triangle is :" );
				 b = in.nextInt();
				 
				 System.out.println("Enter the Height of Triangle is :" );
				 h = in.nextInt();

				
				 AreaOfTriangle = b*h/2;
				 System.out.println("Base of Triangle is :" +b+ ", Height of Triangle is:  "+h+ " and " + "Area of Triangle is :" +AreaOfTriangle);
			 
				 
//					Area of Rectangle 
					System.out.println("\n Area Of Reatangle:");
					 int l;
					 int B;
					 int AreaOfRectangle;
					 
					 System.out.println("Enter the Length of Reactangle is :" );
					 l = in.nextInt();
					 
					 System.out.println("Enter the Bradth of Rectangle is :" );
					 B = in.nextInt();

					
					 AreaOfRectangle = l*B;
					 System.out.println("Length of Reactangle is :" +l+ ", Bradth of Rectangle is:  "+B+ " and " + "Area of Rectangle is :" +AreaOfRectangle);
				 
			
			
			
	}

}

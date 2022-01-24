package switchPack;

/*use switch case write menu driven program to calculate area of square, reactangle, circle,triangle*/
import java.util.Scanner;

public class SwitchShape {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	int choiceShape;
	 
	 System.out.println("The Shapes available are: ");
	 System.out.println("1. Squar");
	 System.out.println("2. Reactangle");
	 System.out.println("3. Circle");
	 System.out.println("4. Triangle");
	 
	 System.out.println("Enter your choice here to calculate the area of the shape: ");
	  choiceShape = sc.nextInt();
	  
	  switch(choiceShape) {
	  case 1:
		  float s, Sarea;
		  System.out.println("Enter the Side of Squar");
		  s = sc.nextFloat();
		  Sarea = s*s;
		  System.out.println("Side of squar is: " +s+ " and The area of squar is: " +Sarea);
		  break;
	  case 2:
		  float l, b, Rarea;
		  System.out.println("Enter the Length of Reactangle is: ");
		  l = sc.nextFloat();
		  System.out.println("Enter the Breadth of Reactangle is: ");
		  b = sc.nextFloat();
		  Rarea = l*b;
		  System.out.println("Length of Recatangel is: " +l+ ", Breadath of Recatangel is: " +b+ " and The area of Reactangle is: " +Rarea);
		  break;
	  case 3:
		  float r, Carea;
		  float pay =3.14f;
		  System.out.println("Enter the redius of Circle is: ");
		  r = sc.nextFloat();
		  Carea = pay*r*r;
		  System.out.println("Redius of Circle is: " +r+ " and The area of Circle is: " +Carea);
		  break;
	  case 4:
		  float B, h, Tarea;
		  System.out.println("Enter the Base Triangle is: ");
		  B = sc.nextFloat();
		  System.out.println("Enter the height of Triangle is: ");
		  h = sc.nextFloat();
		  Tarea = (h*B)/2;
		  System.out.println("Base of Triangel is: " +B+ ", Height of Triangel is: " +h+ " and The area of Triangle is: " +Tarea);
		  break;
	 default:
		 System.out.println("Invalid input");
	  }
 }
}

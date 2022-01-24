package packArea;

/*1. Program to find area of reactangle whose length and breadth float values
 * 2. program to find area of square
   3. program to find area of triangle
   4. program to find area of circle
 * 
 * 
 * */


public class areaOfShape {
	public static void main(String args[]) {
		float l= 20.9f, b= 40.54f;
		float AreaOfRectangle;
		AreaOfRectangle = l*b;
		
	System.out.println("\n Area of Reactangle is ");
	System.out.println("Length of Rectangle is:" +l+ " And "+ "Bradth Of Recatngle is :" +b+ " Area of Rectangle is: " +AreaOfRectangle);


	
	
	float s = 20.8f;
	float AreaOfSquare;
	AreaOfSquare = s*s;
	System.out.println("\n Area of Square is ");
	System.out.println("Side of sqaure is :" +s+ "Area Of Square is :" +AreaOfSquare);
	
	
	float B = 20.8f;
	float h = 30.56f;
	float AreaOfTriangle;
	AreaOfTriangle= h*B/2;
	System.out.println("\n Area of Triangle is ");
	System.out.println("Base od Triangle is :" +B+ "Height of Triangle is :" +h+ "Area Of triangle is :" +AreaOfTriangle);
	
	float r = 20.8f;
	float pay = 3.14f;
	float AreaOfCircle;
	AreaOfCircle= pay*r*r;
	System.out.println("\n Area of Circle is ");
	System.out.println(" radius of Circle  is :" +r+ "Area Of Circle is :" +AreaOfCircle);
	
	
		
	}

}

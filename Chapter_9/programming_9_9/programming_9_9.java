import java.lang.Math;
import java.util.Scanner;

/**
*
* programming_9_9()
* 
* Programming exercise
*
*/

class programming_9_9 {
	public static void main(String[] args) {
		
		// Show Perimeter A
		System.out.println("Perimeter of Polygon A: " + new RegularPolygon(6, 4).getPerimeter());
		
		// Show Area A
		System.out.println("Area of Polygon A: " + new RegularPolygon(6, 4).getArea());
		
		// Show Perimeter B
		System.out.println("Perimeter of Polygon B: " + new RegularPolygon(10, 4, 5.6, 7.8).getPerimeter());
		
		// Show Area B
		System.out.println("Area of Polygon B: " + new RegularPolygon(10, 4, 5.6, 7.8).getArea());
		
		// Show Perimeter C
		System.out.println("Perimeter of Polygon C: " + new RegularPolygon().getPerimeter());
		
		// Show Area C
		System.out.println("Area of Polygon C: " + new RegularPolygon().getArea());

	}
}

/**
*
* RegularPolygon
*
* create a simple polygon and get/set values.
*
*/

class RegularPolygon {
	
	private static double x;
	private static double y;
	private static double side;
	private static int n;
	
	// Set No Arg Constructor
	public RegularPolygon () {
		
		// Set X Value
		setX(0);
		
		// Set Y Value
		setY(0);
		
		// Set Side Value
		setSide(1);
		
		// Set N Value
		setN(3);
	}
	
	// Set 4 arg Constructor
	public RegularPolygon (int sides, double length, double posX, double posY) {
		
		// Set X Value
		setX(posX);
		
		// Set Y Value
		setY(posY);
		
		// Set Side Value
		setN(sides);
		
		// Set N Value
		setSide(length);
	}
	
	// Set 2 arg Constructor
	public RegularPolygon (int sides, double length) {
		
			// Set X Value
			setX(0);
			
			// Set Y Value
			setY(0);
			
			// Set Side Value
			setN(sides);
			
			// Set N Value
			setSide(length);
		}
	
	public static double getX() {
		
		// Return X Value
		return x;
	}
	
	public static void setX(double value) {
		
		// Set X Value
		x = value;
	}
	
	public static double getY() {
		
		// Return Y Value
		return y;
	}
	
	public static void setY(double value) {
		
		// Set Y Value
		y = value;
	}
	
	public static double getN() {
		
		// Return N Value
		return n;
	}
	
	public static void setN(int value) {
		
		// Set N Value
		n = value;	
	}
	
	public static double getSide() {
		
		// Return Side Value
		return side;
	}
	
	public static void setSide(double value) {
		
		// Set Side Value
		side = value;
	}
	
	public static double getPerimeter() {
		
		// Return Perimeter Value
		return (n * side);
	}
	
	public static double getArea() {
		
		// Return Area Value
		return ((n * Math.pow(n, 2)) / (4 * Math.tan(Math.PI / n)));
	}
}
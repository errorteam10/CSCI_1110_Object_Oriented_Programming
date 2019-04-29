import java.lang.Math;
import java.util.Scanner;

/**
*
* programming_9_9()
* 
* Programming exercise
*
* @author Brent Dalling
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
	
	private double x;
	private double y;
	private double side;
	private int n;
	
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
	
	public double getX() {
		
		// Return X Value
		return  x;
	}
	
	public void setX(double value) {
		
		// Set X Value
		 x = value;
	}
	
	public double getY() {
		
		// Return Y Value
		return  y;
	}
	
	public void setY(double value) {
		
		// Set Y Value
		 y = value;
	}
	
	public double getN() {
		
		// Return N Value
		return  n;
	}
	
	public void setN(int value) {
		
		// Set N Value
		 n = value;	
	}
	
	public double getSide() {
		
		// Return Side Value
		return  side;
	}
	
	public void setSide(double value) {
		
		// Set Side Value
		 side = value;
	}
	
	public double getPerimeter() {
		
		// Return Perimeter Value
		return ( n *  side);
	}
	
	public double getArea() {
		
		// Return Area Value
		return (( n * Math.pow( n, 2)) / (4 * Math.tan(Math.PI /  n)));
	}
}
/**
*
* @author Brent Dalling
*
* <h1> Geometric Object </h1>
*
* <p> Super class containing the subclass Triangle and all available methods.
*
*/

import java.util.Scanner;

abstract class GeometricObject {
	
	// Input 
	private static Scanner input = new Scanner(System.in);
	
	// Object Attributes
	protected static double 	sideA;
	protected static double 	sideB;
	protected static double 	sideC;
	protected static String 	color;
	protected static boolean 	filled;
	
	protected static Triangle triangle;
	
	
	public static void main(String[] args) {
		
		// Get Side A
		System.out.print("Enter Side A: ");
		sideA = input.nextDouble();
		
		// Get Side B
		System.out.print("Enter Side B: ");
		sideB = input.nextDouble();
		
		// Get Side C
		System.out.print("Enter Side C: ");
		sideC = input.nextDouble();
		
		// get Color
		System.out.print("Enter Object Color: ");
		color = input.next();
		
		System.out.println("");
		
		// Get Filled 
		System.out.print("Fill Object? y/n yes/no: ");
		String temp = input.next();
		
		switch (temp) {
			case "y":
				filled = true;
				break;
			case "yes":
				filled = true;
				break;
			case "n":
				filled = false;
				break;
			case "no": 
				filled = false;
				break;
		}
		
		triangle = new Triangle(sideA, sideB, sideC, color, filled);
		
		System.out.print("\n Area: " + triangle.getArea() + "\n Perimeter: " + triangle.getPerimeter() + "\n Color: " + triangle.getColor() + "\n Filled: " + triangle.getFilled());
		
	}

}

class Triangle 
	extends GeometricObject {
		
		public Triangle(double sideA, double sideB, double sideC, String color, Boolean filled) {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.color = color;
			this.filled = filled;
		}
		
		// Set Side A Values
		protected void setSideA(double sideA) {
			this.sideA = sideA;
		}
		
		// Set Side B Values
		protected void setSideB(double sideB) {
			this.sideB = sideB;
		}
		
		// Set Side C Values
		protected void setSideC(double sideC) {
			this.sideC = sideC;
		}
		
		// Set Color value
		protected void setColor(String color) {
			this.color = color;
		}
		
		// Set Filled Value
		protected void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		
		// Read Side A value
		protected double getSideA() {
			return this.sideA;
		}
		
		// Read Side B Value
		protected double getSideB() {
			return this.sideB;
		}
		
		// Read Side C Value
		protected double getSideC() {
			return this.sideC;
		}
		
		// Read Color value
		protected String getColor() {
			return this.color;
		}
		
		// Read Filled Value
		protected Boolean getFilled() {
			return this.filled;
		}
		
		
		// Get Area
		protected double getArea() {
			double s = (this.sideA + this.sideB + this.sideC) / 2;
			return Math.sqrt(s * ((s - this.sideA) * (s - sideB) * (s - sideC)));
		}
		
		// Get Perimeter
		protected double getPerimeter() {
			return this.sideA + this.sideB + this.sideC;
		}
}
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

public class programming_exercise_13_1 {
	
	// Input 
	private static Scanner input = new Scanner(System.in);
	
	// Object Attributes
	static double 	sideA;
	static double 	sideB;
	static double 	sideC;
	static String 	color;
	static boolean filled;
	
	
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
			
			Triangle object = new Triangle(sideA, sideB, sideC, color, filled);
			
			System.out.print("\n Area: " + object.getArea() + "\n Perimeter: " + object.getPerimeter() + "\n Color: " + object.getColor() + "\n Filled: " + object.getFilled());
			
		}
		
}

abstract class GeometricObject {
	
	// Input 
	private static Scanner input = new Scanner(System.in);
	
	// Object Attributes
	protected static String 	color;
	protected static boolean 	filled;
	
	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
	
	// Set Color value
	public void setColor(String color) {
		this.color = color;
	}
	
	// Set Filled Value
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Read Color value
	public String getColor() {
		return this.color;
	}
	
	// Read Filled Value
	public Boolean getFilled() {
		return this.filled;
	}
	
	
	

}

class Triangle 
	extends GeometricObject {
		
		protected static double 	sideA;
		protected static double 	sideB;
		protected static double 	sideC;
		
		public Triangle(double sideA, double sideB, double sideC, String color, Boolean filled) {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.color = color;
			this.filled = filled;
		}
		
		public Triangle() {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
			this.color = color;
			this.filled = filled;
		}
		
		// Set Side A Values
		public void setSideA(double sideA) {
			this.sideA = sideA;
		}
		
		// Set Side B Values
		public void setSideB(double sideB) {
			this.sideB = sideB;
		}
		
		// Set Side C Values
		public void setSideC(double sideC) {
			this.sideC = sideC;
		}
		// Read Side A value
		public double getSideA() {
			return this.sideA;
		}
			
		// Read Side B Value
		public double getSideB() {
			return this.sideB;
		}
			
		// Read Side C Value
		public double getSideC() {
			return this.sideC;
		}
		
		// Get Area
		@Override
		public double getArea() {
			double s = (this.sideA + this.sideB + this.sideC) / 2;
			return Math.sqrt(s * ((s - this.sideA) * (s - sideB) * (s - sideC)));
		}
		
		// Get Perimeter
		@Override
		public double getPerimeter() {
			return this.sideA + this.sideB + this.sideC;
		}
}
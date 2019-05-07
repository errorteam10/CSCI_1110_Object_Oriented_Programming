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
import javax.xml.stream.events.*;

abstract class GeometricObject {
	
	// Input 
	public static Scanner input = new Scanner(System.in);
	
	// Object Attributes
	protected double 	sideA;
	protected double 	sideB;
	protected double 	sideC;
	protected double	sideD;
	protected String 	color;
	protected boolean 	filled;
	
	protected static Triangle triangle;
	protected static Rectangle rectangle;
	
	
	public static void main(String[] args) {
		
		// Make New Triangle Object
		triangle = new Triangle();
		triangle.newTriangle();
		
		// Make New Rectangle Object
		rectangle = new Rectangle();
		rectangle.newRectangle();
		
	}

}

abstract interface colorable {
	public abstract void howToColor();
}

class Rectangle
	extends GeometricObject implements colorable{
		
		public Rectangle(double sideANew, double sideBNew, double sideCNew, double sideDNew, String colorNew, Boolean filledNew) {
			
			// Define Rectangle Attributes
			sideA = sideANew;
			sideB = sideBNew;
			sideC = sideCNew;
			sideD = sideDNew;
			color = colorNew;
			filled = filledNew;
		}
		
		public Rectangle() {
			
			// Define Rectangle Attributes
			sideA = 1;
			sideB = 1;
			sideC = 1;
			sideD = 1;
			color = "white";
			filled = true;
		}
		
		@Override
		public void howToColor() {
			System.out.println("\n Color All Four Sides");
		}
		
		public void newRectangle() {
			// Get Side A
			System.out.print("\n Enter Side A: ");
			sideA = input.nextDouble();
			
			// Get Side B
			System.out.print("\n Enter Side B: ");
			sideB = input.nextDouble();
			
			// Get Side C
			System.out.print("\n Enter Side C: ");
			sideC = input.nextDouble();
			
			// Get Side C
			System.out.print("\n Enter Side D: ");
			sideD = input.nextDouble();
			
			// get Color
			System.out.print("\n Enter Object Color: ");
			color = input.next();
			
			// Get Filled 
			System.out.print("\n Fill Object? y/n yes/no: ");
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
			
			rectangle = new Rectangle(sideA, sideB, sideC, sideD, color, filled);
			
			System.out.print("\n Area: " + rectangle.getArea() + "\n Perimeter: " + rectangle.getPerimeter() + "\n Color: " + rectangle.getColor() + "\n Filled: " + rectangle.getFilled());
			howToColor();
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
		
		// Set Side D Values
		protected void setSideD(double sideD) {
			this.sideD = sideD;
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
		
		// Read Side D Value
		protected double getSideD() {
			return this.sideD;
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
			return this.sideA * this.sideB;
		}
		
		// Get Perimeter
		protected double getPerimeter() {
			return this.sideA + this.sideB + this.sideC + this.sideD;
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
		
		public Triangle() {
			// Define Triangle Attributes
			this.sideA = 1;
			this.sideB = 1;
			this.sideC = 1;
			this.color = "white";
			this.filled = true;
		}
		
		public void newTriangle() {
			// Get Side A
			System.out.print("\n Enter Side A: ");
			sideA = input.nextDouble();
			
			// Get Side B
			System.out.print("\n Enter Side B: ");
			sideB = input.nextDouble();
			
			// Get Side C
			System.out.print("\n Enter Side C: ");
			sideC = input.nextDouble();
			
			// get Color
			System.out.print("\n Enter Object Color: ");
			color = input.next();
			
			System.out.println("");
			
			// Get Filled 
			System.out.print("\n Fill Object? y/n yes/no: ");
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
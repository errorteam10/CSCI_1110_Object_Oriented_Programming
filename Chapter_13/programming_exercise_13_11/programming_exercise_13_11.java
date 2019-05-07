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

abstract interface Colorable {
	public abstract void howToColor();
}

public class programming_exercise_13_11 {
	
	// Input 
	private static Scanner input = new Scanner(System.in);
	
	// Object Attributes
	static double 	sideA;
	static double 	sideB;
	static double 	sideC;
	static String 	color;
	static boolean 	filled;
	static double	width;
	static double 	height;
	
	
	public static void main(String[] args) {
			
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
			
			Triangle object = new Triangle(sideA, sideB, sideC, color, filled);
			
			System.out.print("\n Area: " + object.getArea() + "\n Perimeter: " + object.getPerimeter() + "\n Color: " + object.getColor() + "\n Filled: " + object.getFilled());
			
			// Get Side A
			System.out.print("\n \n Enter Height: ");
			height = input.nextDouble();

			// Get Side B
			System.out.print("\n Enter Width: ");
			width = input.nextDouble();

			// get Color
			System.out.print("\n Enter Object Color: ");
			color = input.next();

			// Get Filled 
			System.out.print("\n Fill Object? y/n yes/no: ");
			temp = input.next();

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

			Rectangle object2 = new Rectangle(width, height, color, filled);

			System.out.print("\n Area: " + object2.getArea() + "\n Perimeter: " + object2.getPerimeter() + "\n Color: " + object2.getColor() + "\n Filled: " + object2.getFilled());
			
			object2.howToColor();
			
			
			
			
			// Get Side A
			System.out.print("\n \n Enter Side Length: ");
			sideA = input.nextDouble();

			// get Color
			System.out.print("\n Enter Object Color: ");
			color = input.next();

			// Get Filled 
			System.out.print("\n Fill Object? y/n yes/no: ");
			temp = input.next();

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

			Octagon object3 = new Octagon(sideA, color, filled);

			System.out.print("\n Area: " + object3.getArea() + "\n Perimeter: " + object3.getPerimeter() + "\n Color: " + object3.getColor() + "\n Filled: " + object3.getFilled());
			
			if(object3.compareTo(new Octagon(2, "red", false)) == 1)
			 	System.out.println("\n They Are The Same");
			else 
				System.out.println("\n They Are Not The Same");
				
			try {
				Object object4 = object3.clone();
				
				System.out.println("\n Object Cloned");					
			} catch (CloneNotSupportedException e) {
				System.out.println(e);
			}
			
			

			
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

class Rectangle extends GeometricObject implements Colorable {
	private double width;
	private double height;

	public Rectangle() {
		this.width = 1;
		this.height = 1;
		this.color = "white";
		this.filled = true;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.filled = filled;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public void howToColor() {
		System.out.print("\n \n Color all four sides");
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

class Octagon 
	extends GeometricObject implements Cloneable, Comparable<Octagon> {
		
		protected static double 	sideA;
		
		public Octagon(double sideA, String color, Boolean filled) {
			
			// Define Triangle Attributes
			this.sideA = sideA;
			this.color = color;
			this.filled = filled;
		}
		
		public Octagon() {
			
			// Define Triangle Attributes
			this.sideA = 1;
			this.color = "White";
			this.filled = true;
		}
		
		// Set Side A Values
		public void setSideA(double sideA) {
			this.sideA = sideA;
		}
		
		// Read Side A value
		public double getSideA() {
			return this.sideA;
		}
					
		// Get Area
		@Override
		public double getArea() {
			return (2 + (4 / Math.sqrt(2)) * this.sideA * this.sideA);
		}
		
		// Get Perimeter
		@Override
		public double getPerimeter() {
			return this.sideA * 8;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		@Override 
		public int compareTo(Octagon o) {
			if(getArea() != o.getArea())
				return 1;
			else
				return 0;
		}
}
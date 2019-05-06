

/**
*
* @author Brent Dalling
*
* This file takes in inputs for a triangle class and sets/gets data accordingly.
*
*/

import java.util.Scanner;

class Untitled {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Method Variables 
		GeometricObject shape = new GeometricObject();
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		String color = "";
		String filled = "";
		
		// Prompt User Three Times
		for(int i = 1; i < 4; i++) {
			System.out.print("Enter The Triangle Side " + i + ": ");
			
			switch (i) {
				case 1:
					side1 = input.nextDouble();
					break;
				case 2:
					side2 = input.nextDouble();
					break;
				case 3:
					side3 = input.nextDouble();
					break;
			}
		}
		
		// Set Triangle Color
		System.out.print("Enter Triangle Color: ");
		color = input.next();
		
		// Set Filled Bool
		System.out.print("Fill Triangle? true/false: ");
		filled = input.next();

		// Collect Input and Create New Triangle
		shape.triangle = new Triangle(side1, side2, side3, color, Boolean.parseBoolean(filled));
		
		System.out.println("\nColor: " + shape.triangle.getColor());
		System.out.println("Perimeter: " + shape.triangle.getPerimeter());
		System.out.println("Area: " + shape.triangle.getArea());
		System.out.println("Filled: " + shape.triangle.getFilled());
		System.out.println("toString: " + shape.triangle.toString());
	}
}

class GeometricObject {
	
	// Sub Classes Via Object Reference
	public Triangle triangle;
	
}

class Triangle extends GeometricObject {
	
	// Triangle Attributes
	private double side1;
	private double side2;
	private double side3;
	private String color;
	private boolean filled;
	
	// No Arg Constructor
	public Triangle() {
		
		// Set Sides Default As One.
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
		this.color = "white";
		this.filled = true;
	}
	
	public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
		
		// Set Sides To Assigned Lengths
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	
	/**
	*
	* {{ Set Triangle Values }}
	*
	*/
	
	public void setSide1(double newLength) {
		this.side1 = newLength;
	}
	
	public void setSide2(double newLength) {
		this.side2 = newLength;
	}
		
	public void setSide3(double newLength) {
		this.side3 = newLength;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
	/**
	*
	* {{ Get Triangle Values }}
	*
	*/
		
	public double getSide1() {
		return this.side1;
	}
		
	public double getSide2() {
		return this.side2;
	}
			
	public double getSide3() {
		return this.side3;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public boolean getFilled() {
		return this.filled;
	}
	
	public double getArea() {
		
		// Method Variables
		double s = (this.side1 + this.side2 + this.side3) / 2;
		
		// Complete Herons Formula
		double area = Math.sqrt(s * ((s - this.side1) * (s - side2) * (s - side3)));
		
		// Return Area Value
		return area;
	}
	
	public double getPerimeter() {
		
		// Add And Return Sides
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this. side3;
	}
	
	
}
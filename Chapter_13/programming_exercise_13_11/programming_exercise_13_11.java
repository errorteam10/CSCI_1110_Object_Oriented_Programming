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








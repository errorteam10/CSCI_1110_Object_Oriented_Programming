import java.util.Scanner;

public abstract class GeometricObject {
	
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
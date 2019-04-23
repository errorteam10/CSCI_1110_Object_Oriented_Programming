

package com.rectangle;


/**
 * <h1>Rectangle()</h1>
 * 
 * <p>
 * 	A Java class which represents a rectangle. Each rectangle has an area and perimeter method. 
 * </p>
 * 
 * @author Brent Dalling
 */

public class Rectangle {
	
	static double height = 1;
	static double width = 1;
	
	
	/**
	 * <h1>Rectangle()</h1>
	 * 
	 * <p>
	 * 	Default No Arg constructor to init the rectangle at default values. Default values are set in the class attributes to begin width. So this is an empty constructor.
	 * </p>
	 * 
	 */
	
	public Rectangle() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * <h1>Rectangle(height, width)</h1>
	 * 
	 * <p>
	 * 	Takes height and width values into the constructor and sets the class attributes to those values.
	 * </p>
	 * 
	 * @param height (double; Height of the rectangle)
	 * @param width (double; Width of the rectangle)
	 * 
	 */
	
	public Rectangle(double newHeight, double newWidth) {
		
		// Setting Class Attributes
		height = newHeight;
		width  = newWidth;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * <h1>getArea()</h1>
	 * 
	 * <p>
	 * 	Retrieves the area value for the rectangle class.
	 * </p>
	 * 
	 */
	
	public static double getArea() {
		
		// Define Return Variable
		double value;
		
		// Setting Response To Area. BxH=area
		value = height * width;
		
		// Returning Value.
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * <h1>getPerimeter()</h1>
	 * 
	 * <p>
	 * 	Retrieves the perimeter value for the rectangle class.
	 * </p>
	 * 
	 */
	
	public static double getPerimeter() {
		
		// Define Return Variable
		double value = 0;
		
		// Setting Response Do The Addition Of The height And Width * 2.
		value += ((width + height) * 2);
		
		// Returning Value.
		return value;
	}
}

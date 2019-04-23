import com.rectangle.*;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		// Define Variable With Class And Utilize Class Methods / Constructor
		Rectangle rect1 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle 1 Area: " + rect1.getArea()); // Get's the Area of the rectangle
		System.out.println("Rectangle 1 Perimeter: " + rect1.getPerimeter()); // Get's the Perimeter of the rectangle.
		
		// Define Variable With Class And Utilize Class Methods / Constructor
		Rectangle rect2 = new Rectangle(4, 40);
		System.out.println("Rectangle 2 Area: " + rect2.getArea());// Get's the Area of the rectangle
		System.out.println("Rectangle 2 Perimeter: " + rect2.getPerimeter()); // Get's the Perimeter of the rectangle.
	}
}

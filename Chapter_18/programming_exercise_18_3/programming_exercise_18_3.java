/**
*
* @author Brent Dalling
*
* May 23rd, 2019
*
*/

import java.util.Scanner; 

public class programming_exercise_18_3 {
	
	/** Main method */
	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a non-negative integer A: ");
		int a = input.nextInt();
		System.out.print("Enter a non-negative integer A: ");
		int b = input.nextInt();
		
		// Display factorial
		System.out.println("GCD of " + a + " / " + b + " is " + gcd(a,b));
	}

	/** Return the factorial for a specified number */
	public static long gcd(int a, int b) {
		
		// Determine Values
		if(a > b)
			a = a - b;
		else if (b > a)
			b = b - a;
		else if (a == b) // If They Do Equal Each Other Then Return the GCD
			return b;
		
		// Recursive Call
		return gcd(a, b);

	}
}
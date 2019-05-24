/**
*
* @author Brent Dalling
*
* May 23rd, 2019
*
*/

import java.util.Scanner; 

public class programming_exercise_18_9 {
	
	/** Main method */
	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String string = input.nextLine();
		
		// Display Reversal
		reversal(string);
	}
	
	// reverses string
	public static void reversal(String string) {
		
		// If string length is 0
		if(string.length() == 0)
			return;
		else {
			
			// print last letter of string each time
			System.out.print(string.substring(string.length() - 1));
			
			// remove a letter from the end each time.
			reversal(string.substring(0, string.length() - 1));
		}
			
	}
}
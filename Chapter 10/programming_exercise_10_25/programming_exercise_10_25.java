import java.util.Scanner;
import java.util.Arrays;

class programming_exercise_10_25 {
	
	// Input Variables 
	private static Scanner input = new Scanner(System.in);
	
	// Appplication Entry Point
	public static void main(String[] args) {
		
		// Method Variables 
		String string;
		String regex;
		
		// Get User Input
		System.out.print("Enter String Seperated By Character. \n :> ");
		string = input.nextLine();
		
		System.out.print("Enter Delimiter \n :> ");
		regex = input.nextLine();
		
		split(string, regex);
		
	}
	
	public static String[] split(String string, String regex){
		
		// Method Variables 
		String[] returnVar = new String[string.length()];
		String temp = "";
		int counter = 0;
		int characterCount = string.length();
				
		// Foreach Character In String
		for(int i = 0; i < string.length(); i++) {
			
			// If Last Character In String
			if(characterCount == i + 1) {
				
				// Add Last Group To Array
				temp += Character.toString(string.charAt(i));
				returnVar[counter] = temp;
			} else if(string.charAt(i) == regex.charAt(0)) {
				
				// Add Temp String To Array
				returnVar[counter] = temp;
				
				// Advance Counter 1 To Add Delimiter To Array
				counter++;
				
				// Push Regex To Array
				returnVar[counter] = Character.toString(regex.charAt(0));
				
				// Clear Temp
				temp = "";
				
				//Advance Counter 1
				counter++;
			} else {
				
				// Add To Temp String
				temp += Character.toString(string.charAt(i));
			}
		}
		
		// Reset characterCount For Loops.
		characterCount = 0;
		
		// Count how many non null array entries
		for(int i = 0; i < returnVar.length; i++)
			if(returnVar[i] != null) { characterCount++; }
		
		// Make new return array with non null array count
		String[] returnData = new String[characterCount];
		
		// Foreach array element, add to return;
		for(int i = 0; i < returnData.length; i++)
			returnData[i] = returnVar[i];
		
		// Print Results
		for(String l : returnData)
			System.out.print(l);
		
		return returnVar;
	}
}
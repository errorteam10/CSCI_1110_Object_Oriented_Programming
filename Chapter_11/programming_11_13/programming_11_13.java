/**
*
* @author Brent Dalling
*
* <h1>programming_11_13()</h1>
*
* <p>Removes Duplicate Listings In Array</p>
*
*/

import java.util.*;

class programming_11_13 {
	
	// Class Variables 
	private static Scanner input = new Scanner(System.in);
	
	// Entry Point
	public static void main(String[] args) {
		
		// Method Variables 
		ArrayList<Integer> array = new ArrayList();
		
		// Get User Input
		System.out.println("Enter Ten Integers: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Integer (" + (i + 1) + "): ");
			array.add(i, input.nextInt());
		}
	
		removeDuplicate(array);
				
	}

	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		// Method Variables
		ArrayList<Integer> l1 = new ArrayList<>(new LinkedHashSet<>(list));
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
	}
	
	
}


/**
*
* @author Brent Dalling
*
* Tests Try & Catches Using ArrayIndexOutOfBoundsException
*
*/

import java.util.Scanner;
import javax.sound.midi.*;

class programming_exercise_12_3 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] array = new double[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.floor(Math.random() * 100.0);
		}
		
		System.out.print("Enter Index: ");
		
		try{
			System.out.println("Value Is: " + array[input.nextInt()]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index " + e.getMessage() + " Is Not In Array.");
		}
	}
	
}
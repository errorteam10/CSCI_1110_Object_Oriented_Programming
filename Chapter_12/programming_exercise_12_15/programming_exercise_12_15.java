

/**
*
* @author Brent Dalling
*
* Tests Try & Catches Using ArrayIndexOutOfBoundsException
*
*/

import java.util.Scanner;
import javax.sound.midi.*;
import java.nio.file.*;
import java.io.*;
import java.lang.System;

class programming_exercise_12_15 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] array = new double[100];
		int counter = 0;
		
		// Creating New File Object
		File file = new File(System.getProperty("user.home") + "/Desktop/programming_exercise_12_15.txt");
		
		// Make 100 Random Numbers
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.floor(Math.random() * 100.0);
		}
		
		
		
		// Try Creating New File
		try {
			PrintWriter writer = new PrintWriter(file);
			
			for(int i = 0; i < array.length; i++) {
				writer.print(array[i] + " ");
			}
			
			writer.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		// Try Reading From New File
		try {
			Scanner content = new Scanner(file);
			
			while(content.hasNext()) {
				System.out.print(content.nextDouble() + " ");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
	}
	
}
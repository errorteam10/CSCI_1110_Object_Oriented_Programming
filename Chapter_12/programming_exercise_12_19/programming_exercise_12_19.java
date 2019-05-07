
/**
*
* @author Brent Dalling
*
* Tests Try & Catches Using ArrayIndexOutOfBoundsException
*
*/

import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.lang.System;
import java.net.URL;


class programming_exercise_12_15 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[] array = new double[100];
		int counter = 0;
		
		// Try Reading From Web
		try {
			
			URL url = new URL("http://cs.armstrong.edu/liang/Lincoln.txt");	
			
			Scanner content = new Scanner(url.openStream());
			
			int count = 0;
			while(content.hasNext()) {
				String line = content.nextLine();
				
				for(int i = 0; i < line.length(); i++) {
					
					if(line.charAt(i) == ' ')
						count++;
				}
			}
			
			System.out.println(count);
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}
	
}
/**
*
* @author brent dalling
*
* may 21st, 2019
*
*/


import java.io.*;
import java.util.Scanner;

public class programming_exercise_17_15 {
	
	private static Scanner get = new Scanner(System.in);
	private static DataInputStream input;
	private static DataOutputStream output;
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			System.out.print("Enter Input File: ");
			input = new DataInputStream(new FileInputStream(get.nextLine()));
			
			System.out.print("\n Enter Output File: ");
			output = new DataOutputStream(new FileOutputStream(get.nextLine()));
			
			for(;;){
				
				try {
					output.writeByte(input.readByte() - 5);
				} catch(EOFException eof) {
					break;
				}
			}
			
			
		} catch (IOException io) {
			System.out.println(io);
		}
		
		
	}
}
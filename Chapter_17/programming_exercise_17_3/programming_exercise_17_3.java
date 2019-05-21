/**
*
* @author brent dalling
*
* may 21st, 2019
*
*/


import java.io.*;

public class programming_exercise_17_3 {
	public static void main(String[] args) throws IOException {
		try ( // Create an output stream for file temp.dat
			DataOutputStream output =
				new DataOutputStream(new FileOutputStream("temp.dat", true));
		) {
			// Create 100 Random Numbers
			for(int i = 0; i < 100; i++) {
				output.writeInt((int) Math.round((Math.random() * 100) + 1));
			}	
			
		}
		
		try ( // Create an input stream for file temp.dat
			DataInputStream input =
				new DataInputStream(new FileInputStream("temp.dat"));
		) {
			
			int total = 0;
			
			for(;;) {
				
				try {
					total += input.readInt();
				} catch(Exception e) {
					break;
				}
			}
			
			System.out.println("Total: " + total);
	
		}
	}
}
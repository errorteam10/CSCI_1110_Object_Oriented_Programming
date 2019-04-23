import java.util.Date;


class Programming_Exercise_9_3 {
	public static void main(String[] args) {
		
		// Set Variables 
		Date date = new Date();
		int  elapsed = 1000;
		
		// iterate 8 times
		for (int i = 0; i < 8; i++) {
			
			// Set The Elapsed Time
			date.setTime(elapsed *= 10);
			
			// Print To User Elapsed Time.
			System.out.println(date.toString());
		}
		
	}
}
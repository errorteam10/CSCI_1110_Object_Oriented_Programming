import java.util.Scanner;
import java.util.regex.Pattern;
import java.lang.CharSequence;

class Calculator {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num1   = "";
		String num2   = "";
		String op     = "";
		// The result of the operation
		double result = 0.0;
		
		// Prompt user
		System.out.print("Enter the operation: ");
		num1 = input.next();
		op   = input.next();
		num2 = input.next();
		
		
		if(!num1.matches("-?(0|[1-9]\\d*)")) {
			System.out.println("Invalid Input: " + num1);
			
		} else {
			if(!num2.matches("-?(0|[1-9]\\d*)")) {
				System.out.println("Invalid Input: " + num2);
				
			} else {
				if(!op.matches("-?(0|[1-9 -+/*]\\d*)")) {
					System.out.println("Invalid Input: " + op);
				} else {
					// Determine the operator
					switch (op.charAt(0)) { 
						case '+': 
							result = Integer.parseInt(num1) + Integer.parseInt(num2);
							break;
						case '-': 
							result = Integer.parseInt(num1) - Integer.parseInt(num2);
							break;
						case '.': 
							result = Integer.parseInt(num1) * Integer.parseInt(num2);
						case '*': 
							result = Integer.parseInt(num1) * Integer.parseInt(num2);
							break;
						case '/': 
							result = Integer.parseInt(num1) / Integer.parseInt(num2);
					}
					
					// Display result
					System.out.println(num1 + ' ' + op + ' ' + num2
						+ " = " + result);
				}
				

				
			}
		}
		
	}
}

import java.util.Scanner;

public class Calculator {
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

    // Determine the operator
    switch (op.charAt(0)) { 
      case '+': 
        try {
          result = Integer.parseInt(num1) + Integer.parseInt(num2);
        } catch (NumberFormatException e){
          System.out.println("Invalid Input " + e.getMessage());
        }
        break;
      case '-': 
        try {
          result = Integer.parseInt(num1) - Integer.parseInt(num2);
        } catch (NumberFormatException e) {
          System.out.println("Invalid Input " + e.getMessage());
        }
        break;
      case '.': 
        try {
          result = Integer.parseInt(num1) * Integer.parseInt(num2);
        } catch (NumberFormatException e) {
          System.out.println("Invalid Input " + e.getMessage());
        }
        break;
      case '/': 
        try {
          result = Integer.parseInt(num1) / Integer.parseInt(num2);
        } catch(NumberFormatException e) {
          System.out.println("Invalid Input " + e.getMessage());
        }
    }

    // Display result
    System.out.println(num1 + ' ' + op + ' ' + num2
      + " = " + result);
  }
}

/**
*
* programming_exercise_10_3()
*
* Entry point to the application
*
* @author Brent Dalling
* Date: April 29th, 2019
*
*/

class programming_exercise_10_3 {
	public static void main(String[] args) {
		
		MyInteger one = new MyInteger(5);
		MyInteger two = new MyInteger(6);
		
		System.out.println("Without Parameters Except For Equals and ParseInt. \n");
		System.out.println("Object One: \n Even: " + one.isEven() + "\n Odd: " + one.isOdd() + "\n isPrime: " + one.isPrime() + "\n Equals 5: " + one.equals(5) + "\n Parse [1, 2, 3, 4]: " + one.parseInt(("1234").toCharArray()) + "\n");
		System.out.println("Object Two: \n Even: " + two.isEven() + "\n Odd: " + two.isOdd() + "\n isPrime: " + two.isPrime() + "\n Equals 5: " + two.equals(5) + " \n Parse [1, 2, 3, 4]: " + two.parseInt(("1234").toCharArray()) + "\n");
		
		System.out.println("With Int Parameters Except For Equals and ParseInt. ParseInt String \n");
		System.out.println("Object One: \n Even 5: " + one.isEven(5) + "\n Odd 5: " + one.isOdd(5) + "\n isPrime 5: " + one.isPrime(5) + "\n Equals 5: " + one.equals(5) + "\n Parse [1, 2, 3, 4]: " + one.parseInt("1234") + "\n");
		System.out.println("Object Two: \n Even 6: " + two.isEven(6) + "\n Odd 6: " + two.isOdd(6) + "\n isPrime 6: " + two.isPrime(6) + "\n Equals 6: " + two.equals(6) + " \n Parse [1, 2, 3, 4]: " + two.parseInt("1234") + "\n");
		
		System.out.println("With Object Parameters Except For Equals and ParseInt. ParseInt String \n");
		System.out.println("Object One: \n Even Object: " + one.isEven(one) + "\n Odd Object: " + one.isOdd(one) + "\n isPrime Object: " + one.isPrime(one) + "\n Equals Object: " + one.equals(one) + "\n Parse [1, 2, 3, 4]: " + one.parseInt("1234") + "\n");
		System.out.println("Object Two: \n Even Object: " + two.isEven(two) + "\n Odd Object: " + two.isOdd(two) + "\n isPrime Object: " + two.isPrime(two) + "\n Equals Object: " + two.equals(two) + " \n Parse [1, 2, 3, 4]: " + two.parseInt("1234") + "\n");


	}
}


/**
*
* MyInteger()
*
* A group of methods to perform boolean tests on a given int or object.
*
*/




class MyInteger {
	
	int value = 0;
	
	public MyInteger(int newValue) {
		value = newValue;
	}
		
		
		
		
	public Boolean isEven() {
		
		// Determine If Value Is Even
		return (value % 2 == 0 ? true : false);
	}
	
	public Boolean isEven(int value) {
		
		// Determine If Value Is Even
		return (value % 2 == 0 ? true : false);
	}
	
	public Boolean isEven(MyInteger value) {
		
		// Determine If Value Is Even
		return (value.value % 2 == 0 ? true : false);
	}
	
	
	
	
	public Boolean isOdd() {
		
		// Determine If Value Is Odd
		return (value % 2 != 0 ? true : false);
	}
		
	public Boolean isOdd(int value) {
		
		// Determine If Value Is Odd
		return (value % 2 != 0 ? true : false);
	}
		
	public Boolean isOdd(MyInteger value) {
		
		// Determine If Value Is Odd
		return (value.value % 2 != 0 ? true : false);
	}
	
	
	public boolean isPrime() {
		
		// Loop Until Fail
		for(int i = 2; i <= value / 2; i++) {
			if(value % i == 0)
				return false;
		}
		
		// Return If No Fail
		return true;
	}
	
	public boolean isPrime(int value) {
		
		// Loop Until Fail
		for(int i = 2; i <= value / 2; i++) {
			if(value % i == 0)
				return false;
		}
		
		// Return If No Fail
		return true;
	}
		
	public boolean isPrime(MyInteger value) {
		
		// Loop Until Fail
		for(int i = 2; i <= value.value / 2; i++) {
			if(value.value % i == 0)
				return false;
			}
		
		// Return If No Fail
		return true;
	}
	
	public boolean equals(int check) {
		
		// If equals check
		return (value == check ? true : false);
	}
	
	public boolean equals(MyInteger check) {
		
		// If equals check
		return (value == check.value ? true : false);
	}
	
	public int parseInt(char[] array) {
		int result = 0;
		
		// Loop for length and stuff into result
		for(int i = 0; i < array.length; i++) 
			result = (result * 10) + (int)(array[i] - '0');
		
		return result;
	} 
	
	public int parseInt(String string) {
		int result = 0;
		char[] array = new char[string.length()];
		
		// Loop for length and stuff into array
		for(int i = 0; i < string.length(); i++)
			array[i] = string.charAt(i);
		
		// Loop for length and stuff into result
		for(int i = 0; i < array.length; i++) 
			result = (result * 10) + (int)(array[i] - '0');
		
		return result;

	}
	
}
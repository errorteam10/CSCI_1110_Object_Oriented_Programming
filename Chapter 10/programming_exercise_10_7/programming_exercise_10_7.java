import java.util.Scanner;
import java.util.Date;

/**
*
* programming_exercise_10_7()
*
* Entry point to the application
* 
* @author Brent Dalling
*
*/

class programming_exercise_10_7 {
	
	private static Scanner input = new Scanner(System.in);
	private static Account account;
	private static Account[] acc = new Account[10];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account(i, 100);
		}
		
		accessAccount();
	}
	
	// Access Account menu
	public static void accessAccount() {
		
		// Method Variables 
		int selection;
		int id;
		
		// Repeating Menu
		while(true) {
			
			System.out.print("Enter Account ID: ");
			id = input.nextInt();

			while(true){
				System.out.print("\n Please Select An Option: \n [1] Deposit \n [2] Withdraw \n [3] View Balance \n [4] Go back \n Selection:  ");
				
				// Obtain Selection
				selection = input.nextInt();
				
				// Determine Action
				if(selection == 1)
					deposit(id);
				else if(selection == 2)
					withdraw(id);
				else if(selection == 3)
					balance(id);
				else if(selection ==4)
					break;
			}

		}		
	}
	
	public static void balance(int id) {
		System.out.print("\n Balance: " + acc[id].getBalance() + "\n");
	}
	
	public static void deposit(int id) {
		System.out.print("\n Enter Deposit Amount: ");
		System.out.print("\n New Balance: " + acc[id].deposit(input.nextDouble()) + "\n");
	}
	
	public static void withdraw(int id) {
		System.out.print("\n Enter Withdrawal Amount: ");
		System.out.print("\n New Balance: " + acc[id].withdraw(input.nextDouble()) + "\n");
	}

}







/**
*
* Account()
*
* Simple bank account management application
*
*/

class Account {
	
	// Class Variables
	private int 		id;
	private double 	balance;
	
	public Account() {
		
	}
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double amount) {
		return (balance += amount);
	}
	
	public double withdraw(double amount) {
		return (balance -= amount);
	}
}
import java.util.Scanner;
import java.util.Date;

/**
*
* programming_exercise_9_7()
*
* Entry point to the application
*
*/

class programming_exercise_9_7 {
	
	private static Scanner input = new Scanner(System.in);
	private static Account account;
	
	public static void main(String[] args) {
		
		// Declaring Variables
		int selection;
		
		// Get User Input with repeating menu
		while(true) {
			System.out.print("\n Please Select An Option: \n [1] New Account \n [2] Access Account \n [3] Quit \n Selection: ");
			
			// Obtain selection 
			selection = input.nextInt();
			
			// Determine next menu/action
			if(selection == 1) {
				newAccount();
			} else if(selection == 2) {
				accessAccount();
			} else {
				break;
			}
		}
	}
	
	// Guides Through Process Of Creating A New Account.
	public static void newAccount() {
		
		// Method Variables 
		int id;
		double balance;
		
		System.out.print("Enter Account ID: ");
		id = input.nextInt();
		
		System.out.print("Enter Starting Balance: ");
		balance = input.nextDouble();
		
		// Create new Account object.
		account = new Account(id, balance);
		
	}
	
	// Access Account menu
	public static void accessAccount() {
		
		// Method Variables 
		int selection;
		int id;
		
		System.out.print("Enter Account ID: ");
		id = input.nextInt();
		
		// Repeating Menu
		while(true){
			System.out.print("\n Please Select An Option: \n [1] Deposit \n [2] Withdraw \n [3] View Interest Rate \n [4] View Monthly Interest \n [5] Set Interest Rate \n [6] Print Account \n [7] Go Back \n Selection: ");
			
			// Obtain Selection
			selection = input.nextInt();
			
			// Determine Action
			if(selection == 1) {
				deposit(id);
			} else if(selection == 2) {
				withdraw(id);
			} else if(selection == 3) {
				interestRate(id);
			} else if(selection == 4) {
				monthlyInterest(id);
			} else if(selection == 5) {
				setInterestRate(id);
			} else if(selection == 6) {
				print(id);
			} else if(selection == 7) {
				break;
			}
		}
		
	}
	
	public static void deposit(int id) {
		System.out.print("\n Enter Deposit Amount: ");
		System.out.print("\n New Balance: " + account.deposit(input.nextDouble()) + "\n");
	}
	
	public static void setInterestRate(int id) {
		System.out.print("\n Enter Interest Rate: ");
		System.out.print("\n New Interest Rate: " + account.setInterestRate(input.nextDouble()) + "\n");
	}
	
	public static void withdraw(int id) {
		System.out.print("\n Enter Withdrawal Amount: ");
		System.out.print("\n New Balance: " + account.withdraw(input.nextDouble()) + "\n");
	}
	
	public static void interestRate(int id) {
		System.out.print("\n Monthly Interest Rate: " + account.getMonthlyInterestRate());
	}
	
	public static void monthlyInterest(int id) {
		System.out.print("\n Monthly Interest: " + account.getMonthlyInterest());
	}
	
	public static void print(int id) {
		System.out.print("\n ID: " + account.getId() + "\n Balance: " + account.getBalance() + "\n Monthly Interest: " + account.getMonthlyInterest() + "\n Created At: " + account.getDate() + "\n");
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
	private static int 		id;
	private static Date 	date = new Date();
	private static double 	balance;
	private static double 	annualInterestRate;
	
	public Account() {
		
	}
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	public static double getBalance() {
		return balance;
	}
	
	public static int getId() {
		return id;
	}
	
	public static Date getDate() {
		return date;
	}
	
	public static double setInterestRate(double rate) {
		annualInterestRate = rate;
		
		return annualInterestRate;
	}
	
	public static double deposit(double amount) {
		balance += amount;
		
		return balance;
	}
	
	public static double withdraw(double amount) {
		balance -= amount;
		
		return balance;
	}
	
	public static double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	public static double getMonthlyInterest() {
		return ((annualInterestRate / 100) / 12) * balance;
	}
}
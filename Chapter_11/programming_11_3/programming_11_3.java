import java.util.Scanner;
import java.util.Date;


/**
 *
 *	@author Brent Dalling
 *
 * programming_exercise_11_3()
 *
 * Entry point to the application
 *
 */

class programming_exercise_11_3 {

 private static Scanner input = new Scanner(System.in);
 private static Account account = new Account();

 public static void main(String[] args) {

	// Method Variables
	int selection;

	// Get User Input
	while (true) {

	 System.out.print("\n Select Option: \n [1] New Account \n [2] Access Account \n > ");

	 selection = input.nextInt();

	 if (selection == 1)
		newAccount();
	 else if (selection == 2)
		accessAccount();
	}
 }

 public static void newAccount() {

	// Method Variables 
	int id;
	double balance;
	double annualInterestRate;

	// Get User Input
	System.out.print("\n Enter Savings ID: \n > ");
	id = input.nextInt();

	System.out.print("\n Enter Savings Balance: \n > ");
	balance = input.nextDouble();

	System.out.print("\n Enter Savings Annual Interest Rate: \n > ");
	annualInterestRate = input.nextDouble();

	account.Savings = new SavingsAccount(id, balance, annualInterestRate);

	// Get User Input
	System.out.print("\n Enter Checking ID: \n > ");
	id = input.nextInt();

	System.out.print("\n Enter Checking Balance: \n > ");
	balance = input.nextDouble();

	System.out.print("\n Enter Checking Annual Interest Rate: \n > ");
	annualInterestRate = input.nextDouble();

	account.Checking = new CheckingAccount(id, balance, annualInterestRate);
 }

 public static void accessAccount() {

	// Method Variables 
	int selection;
	int id;

	System.out.println("\n Enter Account ID");
	id = input.nextInt();

	// Get user Input
	while (true) {
	 System.out.print("\n Select Option: \n [1] Savings \n [2] Checking \n [3] Back");
	 selection = input.nextInt();

	 if (selection == 1)
		accessSavings(id);
	 else if (selection == 2)
		accessChecking(id);
	 else if (selection == 3)
		break;
	}
 }

 public static void accessSavings(int id) {
	// Method Variables 
	int selection;

	// Repeating Menu
	while (true) {
	 System.out.print("\n Please Select An Option: \n [1] Deposit \n [2] Withdraw \n [3] View Interest Rate \n [4] View Monthly Interest \n [5] Set Interest Rate \n [6] Print Account \n [7] Set Overdraft Limit \n [8] Get Overdraft Limit \n [9] Go Back \n Selection: ");

	 // Obtain Selection
	 selection = input.nextInt();

	 // Determine Action
	 if (selection == 1) {
		account.deposit(id, "savings", account);
	 } else if (selection == 2) {
		account.withdraw(id, "savings", account);
	 } else if (selection == 3) {
		account.interestRate(id, "savings", account);
	 } else if (selection == 4) {
		account.monthlyInterest(id, "savings", account);
	 } else if (selection == 5) {
		account.setInterestRate(id, "savings", account);
	 } else if (selection == 6) {
		account.print(id, "savings", account);
	 } else if (selection == 7) {
		account.setOverdraftLimit(id, "savings", account);
	 } else if (selection == 8) {
		account.getOverdraftLimit(id, "savings", account);
	 } else if (selection == 9) {
		break;
	 }
	}
 }

 public static void accessChecking(int id) {
	// Method Variables 
	int selection;

	// Repeating Menu
	while (true) {
	 System.out.print("\n Please Select An Option: \n [1] Deposit \n [2] Withdraw \n [3] View Interest Rate \n [4] View Monthly Interest \n [5] Set Interest Rate \n [6] Print Account \n [7] Set Overdraft Limit \n [8] Get Overdraft Limit \n [9] Go Back \n Selection: ");

	 // Obtain Selection
	 selection = input.nextInt();

	 // Determine Action
	 if (selection == 1) {
		account.deposit(id, "checking", account);
	 } else if (selection == 2) {
		account.withdraw(id, "checking", account);
	 } else if (selection == 3) {
		account.interestRate(id, "checking", account);
	 } else if (selection == 4) {
		account.monthlyInterest(id, "checking", account);
	 } else if (selection == 5) {
		account.setInterestRate(id, "checking", account);
	 } else if (selection == 6) {
		account.print(id, "checking", account);
	 } else if (selection == 7) {
		account.setOverdraftLimit(id, "checking", account);
	 } else if (selection == 8) {
		account.getOverdraftLimit(id, "checking", account);
	 } else if (selection == 9) {
		break;
	 }
	}
 }

}



/**
*
* <h1>Account()</h1>
* <p> Basic account class that hold the main account id and hold the savings and checking accounts. </p>
*
*
*/


class Account {
 private static Scanner input = new Scanner(System.in);

 public SavingsAccount Savings;
 public CheckingAccount Checking;

 // Base Account Information
 int id;


 public static void deposit(int id, String type, Account account) {

	System.out.print("\n Enter Deposit Amount: ");

	if (type == "savings")
	 System.out.print("\n New Balance: " + account.Savings.deposit(input.nextDouble()) + "\n");
	else
	 System.out.print("\n New Balance: " + account.Checking.deposit(input.nextDouble()) + "\n");
 }

 public static void setInterestRate(int id, String type, Account account) {
	System.out.print("\n Enter Interest Rate: ");

	if (type == "savings")
	 System.out.print("\n New Interest Rate: " + account.Savings.setInterestRate(input.nextDouble()) + "\n");
	else
	 System.out.print("\n New Interest Rate: " + account.Checking.setInterestRate(input.nextDouble()) + "\n");
 }

 public static void withdraw(int id, String type, Account account) {
	System.out.print("\n Enter Withdrawal Amount: ");

	if (type == "savings")
	 System.out.print("\n New Balance: " + account.Savings.withdraw(input.nextDouble()) + "\n");
	else
	 System.out.print("\n New Balance: " + account.Checking.withdraw(input.nextDouble()) + "\n");
 }

 public static void interestRate(int id, String type, Account account) {

	if (type == "savings")
	 System.out.print("\n Monthly Interest Rate: " + account.Savings.getMonthlyInterestRate());
	else
	 System.out.print("\n Monthly Interest Rate: " + account.Checking.getMonthlyInterestRate());
 }

 public static void monthlyInterest(int id, String type, Account account) {
	if (type == "savings")
	 System.out.print("\n Monthly Interest: " + account.Savings.getMonthlyInterest());
	else
	 System.out.print("\n Monthly Interest: " + account.Checking.getMonthlyInterest());
 }

 public static void print(int id, String type, Account account) {
	if (type == "savings")
	 System.out.print("\n ID: " + account.Savings.getId() + "\n Balance: " + account.Savings.getBalance() + "\n Monthly Interest: " + account.Savings.getMonthlyInterest() + "\n Created At: " + account.Savings.getDate() + "\n");
	else
	 System.out.print("\n ID: " + account.Checking.getId() + "\n Balance: " + account.Checking.getBalance() + "\n Monthly Interest: " + account.Checking.getMonthlyInterest() + "\n Created At: " + account.Checking.getDate() + "\n");
 }

 public static void setOverdraftLimit(int id, String type, Account account) {

	// Method Variables
	double limit;

	// Determine Type
	if (type == "savings")
	 System.out.print("Account Can Not Be Overdrafted");
	else
	 System.out.print("\n Enter New Overdraft Limit: ");
	limit = input.nextInt();

	System.out.print("\n New Limit Is: $" + account.Checking.setOverdraftLimit(limit));

 }

 public static void getOverdraftLimit(int id, String type, Account account) {

	// Method Variables
	double limit;

	// Determine Type
	if (type == "savings")
	 System.out.print("Account Can Not Be Overdrafted");
	else
	 System.out.print("\n New Limit Is: $" + account.Checking.getOverdraftLimit());

 }

}


/**
*
* <h1>SavingsAccount()</h1>
*
* <p>The savings account which extends the main account class. This account holds all function for the savings account.</p>
*
*/

class SavingsAccount extends Account {

 // Base Account Information
 public int id;
 public double balance;
 public double annualInterestRate;
 public Date date = new Date();

 public SavingsAccount(int id, double balance, double annualInterestRate) {
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
 }

 public double getBalance() {
	return balance;
 }

 public int getId() {
	return id;
 }

 public Date getDate() {
	return date;
 }

 public double setInterestRate(double rate) {
	annualInterestRate = rate;

	return annualInterestRate;
 }

 public double deposit(double amount) {
	balance += amount;

	return balance;
 }

 public double withdraw(double amount) {
	
	if((balance - amount) <= 0)
		System.out.println("\n Cannot Overdraft This Account.");
	else 
		balance -= amount;

	return balance;
 }

 public double getMonthlyInterestRate() {
	return (annualInterestRate / 100) / 12;
 }

 public double getMonthlyInterest() {
	return ((annualInterestRate / 100) / 12) * balance;
 }

}

/**
*
* <h1>checkingAccount()</h1>
*
* <p>The checking account which extends the main account class. This account holds all function for the checking account.</p>
*
*/

class CheckingAccount {
 // Base Account Information
 public int id;
 public double balance;
 public double annualInterestRate;
 public Date date = new Date();
 public double overdraftLimit;

 public CheckingAccount(int id, double balance, double annualInterestRate) {
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.overdraftLimit = 750;
 }

 public double getBalance() {
	return balance;
 }

 public int getId() {
	return id;
 }

 public Date getDate() {
	return date;
 }

 public double getOverdraftLimit() {
	return overdraftLimit;
 }

 public double setOverdraftLimit(double limit) {
	overdraftLimit = limit;
	return overdraftLimit;
 }

 public double setInterestRate(double rate) {
	annualInterestRate = rate;

	return annualInterestRate;
 }

 public double deposit(double amount) {
	balance += amount;

	return balance;
 }

 public double withdraw(double amount) {
	
	if((balance - amount) <= (overdraftLimit * -1))
	
		System.out.println("\n Overdraft Reached. Pick A Smaller Overdraft. \n Current Balance: " + balance);
	else 
		balance -= amount;
		
	return balance;
 }

 public double getMonthlyInterestRate() {
	return (annualInterestRate / 100) / 12;
 }

 public double getMonthlyInterest() {
	return ((annualInterestRate / 100) / 12) * balance;
 }
}
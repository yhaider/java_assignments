import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkings;
	private double savings;
	// Attributes of each account
	
	public static int numberOfAccounts;
	public static double totalAmount;
	private static Random random = new Random();
	// These are static variables
	
	private static String randomNumGen() {
		return Integer.toString(random.nextInt(1000000000)+1000000000);
	}
	// Static method that generates new random account number
	
	public BankAccount() {
		this.accountNumber = BankAccount.randomNumGen();
		this.checkings = 0;
		this.savings = 0;
		numberOfAccounts++;
	}
	public BankAccount(double checkings, double savings) {
		this.accountNumber = BankAccount.randomNumGen();
		this.checkings = checkings;
		this.savings = savings;
		numberOfAccounts++;
		totalAmount += (this.checkings + this.savings);
	}
	// These are constructor methods

	
	public double getCheckings() {
		return checkings;
	}
	public void setCheckings(double checkings) {
		this.checkings = checkings;
	}
	public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
	// Getters and setters for savings and checkings

	public void depositMoney(double amount, String where) {
		if(where == "checkings" || where == "c") {
			this.checkings += amount;
			totalAmount += amount;
			System.out.println(amount + " was deposited into " + this.accountNumber + " checkings account.");
		}
		else if(where == "savings" || where == "s") {
			this.savings += amount;
			totalAmount += amount;
			System.out.println(amount + " was deposited into " + this.accountNumber + " savings account.");
		}
		else {
			System.out.println("The location to deposit is not specified correctly. Please use 'c' or 'checkings' for checkings and 's' or 'savings' for savings.");
		}
	}
	// This method allows a user to give an amount and a location for where the money
	// should be deposited
	
	public void withdrawMoney(double amount, String where) {
		if(where == "checkings" || where == "c") {
			if(amount <= this.checkings) {
				this.checkings -= amount;
				totalAmount -= amount;
				System.out.println(amount + " was withdrawn from the checkings account associated with no. " + this.accountNumber);
			}
			else {
				System.out.println("You are attempting to withdraw more than the checkings account balance:");
				System.out.println("Your current checkings balance is: " + this.getCheckings());
			}
		}
		else if(where == "savings" || where == "s") {
			if(amount <= this.savings) {
				this.savings -= amount;
				totalAmount -= amount;
				System.out.println(amount + " was withdrawn from the savings account associated with no. " + this.accountNumber);
			}
			else {
				System.out.println("You are attempting to withdraw more than the savings account balance:");
				System.out.println("Your current savings balance is: " + this.getSavings());
			}
		}
		else {
			System.out.println("The location to withdraw from is not specified correctly. Please use 'c' or 'checkings' for checkings and 's' or 'savings' for savings.");
		}
	}
	// This withdraw method allows a user to withdraw a specified amount from either
	// checkings or savings; however if the location is incorrectly specified, or if
	// the user does not have enough in their account, then they will be notified.
	
	public void accountBalance() {
		System.out.println("Total balance is: " + (this.getCheckings() + this.getSavings()));
	}
	// A method to view bank totals
	
	
	public static void main(String[] args) {
		BankAccount p1 = new BankAccount();
		BankAccount p2 = new BankAccount(1000, 2000);
		BankAccount p3 = new BankAccount(100, 500);
		
		p1.accountBalance();
		p2.accountBalance();
		
		p1.depositMoney(25000, "checkings");
		p2.withdrawMoney(300, "savings");
		p3.withdrawMoney(200, "checkings");
		
		p1.accountBalance();
		p2.accountBalance();
		p3.accountBalance();
		
		System.out.println(BankAccount.numberOfAccounts);
		System.out.println(BankAccount.totalAmount);
		
	}
	// Testing out the above
	// Everything *checks* out, guess we can *save* this!
	// Sorry for the terrible puns
}

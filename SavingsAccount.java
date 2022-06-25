/**
 * Name: Keaton Welch
 * File: Savings Account
 * Description: A program used on an ATM for MidFirst Bank to input/display account information, 
 * deposit information and to calculate weekly interest.
 */

//Importing utility to generate date and time
import java.util.Date;

public class SavingsAccount {
	
	//Data fields
	int id;
	double balance;
	double annualIntRate;
	Date dateEstablished;
	
	//The No-Arg Constructor
	public SavingsAccount() {
		id = 0;
		balance = 0;
		annualIntRate = 0.0;
		dateEstablished = new Date();		
	}
	
	//The Second Constructor
	public SavingsAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	//Next I have my Getters and Setters for the ID, Balance, and Annual Interest Rate
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}
	
	public double getAnnualIntRate() {
		return this.annualIntRate;
	}
	
	//Calculates and returns the Weekly Interest Rate from Annual Interest Rate
	public double getWeeklyIntRate() {
		double weeklyIntRate = (this.annualIntRate / 100) / 52;
		return this.balance * weeklyIntRate;
	}
	
	//Calculates and Outputs the Updated Account Balance
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("New Balance: " + this.getBalance());
	}
	
	//Calculates the Account Creation Date/Time
	public Date getDateEstablished() {
		return this.dateEstablished;
	}
	
	//Outputs all of the Account Details
	public void getAccountDetails() {
		System.out.println();
		System.out.println("Account ID: " + this.getId());
		System.out.println("Account Creation Date/Time: " +
	this.getDateEstablished());
		System.out.println("Balance: " + this.getBalance());
		System.out.println("Weekly Interest Amount: $" + 
	Math.round(this.getWeeklyIntRate() *100.0) / 100.0);
		System.out.println();
	}















}
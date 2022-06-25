/**
 * Name: Keaton Welch
 * File: Savings Account Runner
 * Description: A program used on an ATM for MidFirst Bank to input/display account information, 
 * deposit information and to calculate weekly interest.
 */

import java.util.Scanner;

public class SavingsAccountRunner {

	public static void main(String[] args) {
		
		//Data Fields
		Scanner input = new Scanner(System.in);
	
		//Output Introduction Text and Request variable information
		SavingsAccount account = new SavingsAccount();
		System.out.println("Welcome to your Savings Account App!");
		System.out.print("Enter your account number: ");
		account.setId(input.nextInt());
		System.out.print("Enter your inital balance: ");
		account.setBalance(input.nextDouble());
		System.out.print("Enter your annual interest rate: ");
		account.setAnnualIntRate(input.nextDouble());
		
		//Set up to exit the Do-While Loop
		boolean exit = true;
	
		do { 
			//Output for the Menu and request for selection
			System.out.println();
			System.out.println("=============================");
			System.out.println("=       OPTIONS BELOW       =");
			System.out.println("=============================");
		
			System.out.println("1. Deposit");
			System.out.println("2. View Weekly Interest Rate");
			System.out.println("3. View Account Details");
			System.out.println("4. Exit");
			System.out.println("Enter your selection");
			int selection = input.nextInt();
			
			//Input Verification for the selection
			while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
				System.out.println("INVALID SELECTION - TRY AGAIN!");
				selection = input.nextInt();
			}
			
			//Switch Statement to set up the Menu
			switch(selection) {
			
				//Option 1 for Deposit & Input Verification on deposit amount
				case 1 : System.out.println("Enter your deposit ammount: ");
				double amount = input.nextDouble();
				if (amount <= 0) {
					System.out.println("Amount needs to be greater than 0");		
					break;
				}
				else {
					account.deposit(amount);
				}
				break;
				
				//Option 2 for displaying Weekly Interest Rate from getWeeklyIntRate method
				case 2 : System.out.println("Your Weekly Interest Amount is $" + Math.round(account.getWeeklyIntRate() * 100.0) / 100.0);
				break;
				
				//Option 3 for displaying Account Details form getAccountDetails method
				case 3 : account.getAccountDetails();
				break;
				
				//Option 4 to exit the Do-While Loop and close the program
				case 4 : exit = false;
				System.out.println();
				System.out.println("Thank you - Goodbye!");
				break;				
			}
		//Exiting Do-While Loop from Selecting option 4	
		} while(exit);
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account_Exception;
import model.exceptions.AccountException;

public class Program_Account_Exception {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();		
			Account_Exception account = new Account_Exception(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
		}
		catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program_Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y / n)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(name, account, initialDeposit);
		}
		else {
			bank = new Bank(name, account);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.Deposit(deposit);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bank.Withdraw(withdraw);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		sc.close();

	}

}

package entities;

public class Bank {

	private String name;
	private int account;
	private double balance;
	
	public Bank(String name, int count, double InitialDeposit) {
		this.name = name;
		this.account = count;
		Deposit(InitialDeposit);
	}
	
	public Bank(String name, int count) {
		this.name = name;
		this.account = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}
	
	public double getBalance() {
		return balance;
	}

	public double Deposit(double amount) {
		return balance += amount;
	}
	
	public double Withdraw(double amount) {
		return balance -= (amount + 5.00);
	}
	
	public String toString() {
		return "Account: " 
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}

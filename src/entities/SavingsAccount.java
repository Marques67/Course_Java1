package entities;

public final class SavingsAccount extends Account { //Esse 'final' impede que a classe SavingsAccount seja herdada

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) { //Se acrescentar 'final' em um método, impede que ele seja sobreposto
		balance -= amount;
	}
}

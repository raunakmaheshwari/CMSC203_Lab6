public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
 	}
	
	public SavingsAccount(SavingsAccount account, double initialBalance) {
		
		super(account, initialBalance);
		accountNumber = account.getAccountNumber().substring(0, account.getAccountNumber().length() - 2) + "-" + (account.savingsNumber + 1);
		
	}
	
	
	public void postInterest() {
		double interest = (super.getBalance() * rate) / 12;
		super.setBalance(super.getBalance() + interest);
		
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
	
}

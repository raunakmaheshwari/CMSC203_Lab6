public class CheckingAccount extends BankAccount{
	
	public static final double FEE = 0.15;
	
	private String name;
	private double initialAmount;
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + -10);
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		double updatedAmount = amount + 0.15;
		
		return super.withdraw(updatedAmount);
		
	}
	
}

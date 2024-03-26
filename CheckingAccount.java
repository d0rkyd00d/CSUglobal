package bank;

public class CheckingAccount extends BankAccount {
	
	//additional field
	protected double interestRate;
	
	//new constructor for CheckingAccount
	public CheckingAccount(double interestRate, String firstName, String lastName, int accountID, double balance) 
	{
		super(firstName, lastName, accountID, balance);  //superclass constructor
		this.interestRate = interestRate;
	}
	
	//new method for overdraft
	public void processWithdrawal(double amount) 
	{
		balance -= amount;
		if (balance < 0) {
			balance -= 30;
			System.out.println("You have been charged a $30 overdraft fee.\n");
		}
	}
	
	public double getInterestRate() 
	{
		return interestRate;
	}
		
	public void displayAccount()
	{
		System.out.println("Account number: " + getAccountID());
		System.out.println("Account title: " + getFirstName() + " " + getLastName());
		System.out.println("Account balance: " + getBalance());
		System.out.println("Current interest rate: " + getInterestRate()*100 + "%");
	}
  

}

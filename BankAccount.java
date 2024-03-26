package bank;

class BankAccount {
	
	
	protected String firstName;
	protected String lastName;
	protected int accountID;
	protected double balance;
	
	//constructor for BankAccount
	public BankAccount(String firstName, String lastName, int accountID, double balance) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = 0;
	}
	
	//add to balance
	public void deposit(double amount) 
	{
		balance += amount;
	}
	
	//subtract from balance
	public void withdrawal(double amount)
	{
		balance -= amount;
	}
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}	
	
	//printout of summary
	public void accountSummary() 
	{
		System.out.println("Information for " + getAccountID() + ": the current balance for "  
							+ getFirstName() + " "+ getLastName() + " is " + getBalance() + ".\n");
	}
}

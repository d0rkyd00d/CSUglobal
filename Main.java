package bank;

public class Main {

	public static void main(String[] args) {

		BankAccount bank1 = new BankAccount("Jonathan","Hammond", 11374, 0.0);
		CheckingAccount check1 = new CheckingAccount(0.05, "Jonathan","Hammond", 11375, 0.0);
		
		bank1.deposit(58.99);
		bank1.withdrawal(37.99);
		bank1.accountSummary();
		
		check1.deposit(23.99);
		check1.processWithdrawal(54.99);
		check1.displayAccount();
		
	}

}

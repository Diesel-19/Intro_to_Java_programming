package chapter09.Exercise07;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("Balance: " + a.getBalance() + " the monthly interest: " + a.getMonthlyInterest() + "\n"
				+ a.getDateCreated());
	}
}

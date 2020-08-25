package chapter10.Exercise07;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();

	public Account() {
	}

	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;

	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}

	public void withdraw(double withdraw) {
		balance -= withdraw;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

}

package chapter05;

import java.util.Scanner;

public class Exercise05_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Number of years: ");
		int years = input.nextInt();

		System.out.println("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

		double balance = loanAmount, principal, interest;
		System.out.println("Payment#     Interest     Principal     Balance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
		}

	}

}
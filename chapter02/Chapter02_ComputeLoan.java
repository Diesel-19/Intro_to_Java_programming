package chapter02;

import java.util.Scanner;

public class Chapter02_ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = (annualInterestRate / 1200);

		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();

		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();

		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))));
		double totalPayment = monthlyPayment * 12 * numberOfYears;

		System.out.println("Monthly Payment is: " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total Payment is: " + (int)(totalPayment * 100) / 100.0);
	}

}

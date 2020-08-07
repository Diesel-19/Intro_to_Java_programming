package chapter05;

import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Loan Amount: ");
		double loanAmount = input.nextDouble();

		System.out.println("Number of Years: ");
		double noOfYears = input.nextDouble();

		System.out.println("Interest Rate\tMonthly Payement\tTotal Payement");
		for (double interestRate = 5; interestRate <= 8; interestRate += 0.125) {
			double monthlyInterestRate = interestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, noOfYears * 12));
			double totalPayment = monthlyPayment * 12 * noOfYears;
			System.out.printf("%-13.3f\t%-16.2f\t%-13.2f\n", interestRate, monthlyPayment, totalPayment);
		}
	}
}

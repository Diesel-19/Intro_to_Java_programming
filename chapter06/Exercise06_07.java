package chapter06;

import java.util.Scanner;

public class Exercise06_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		int years = 1;
		System.out.println("Years\tFuture Value");
		for (int i = 0; i < 30; i++) {
			System.out.printf("%-5d\t%12.2f",years,futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
			System.out.println();
			years++;
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureInvestment = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
		return futureInvestment;
	}
}

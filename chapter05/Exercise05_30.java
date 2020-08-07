package chapter05;

import java.util.Scanner;

public class Exercise05_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter saving amount: ");
		double money = input.nextDouble();

		System.out.println("Enter interest rate: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Enter the number of months: ");
		double noOfMonths = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		int i = 0;
		double k = 0;
		while (i < noOfMonths) {
			k = (money + k) * (1 + monthlyInterestRate);
			i++;
		}
		System.out.printf("%.3f", k);

	}
}

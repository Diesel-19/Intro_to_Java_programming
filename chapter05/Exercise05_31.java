package chapter05;

import java.util.Scanner;

public class Exercise05_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();

		System.out.println("Enter annual percentage yield: ");
		double annualYield = input.nextDouble();

		System.out.println("Enter the number of months: ");
		double months = input.nextDouble();

		System.out.println("Month\tCD Value");
		int i = 1;
		while (i <= months) {
			amount = amount + amount * 5.75 / 1200;
			System.out.printf("%-5d\t%.2f\n", i, amount);
			i++;
		}
	}
}

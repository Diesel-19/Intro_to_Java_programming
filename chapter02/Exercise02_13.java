package chapter02;

import java.util.Scanner;

public class Exercise02_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double monthlySavingAmount = input.nextDouble();

		double savedAmountAfterMonth = 0;
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);
		savedAmountAfterMonth = (savedAmountAfterMonth + monthlySavingAmount) * (1 + 0.00417);

		System.out.println("After the sixth month: " + savedAmountAfterMonth);
	}

}
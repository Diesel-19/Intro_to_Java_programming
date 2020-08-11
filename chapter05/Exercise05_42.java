package chapter05;

import java.util.Scanner;

public class Exercise05_42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sought commition ");
		double commisionSought = input.nextDouble();
		double salesAmount, balance;
		double commission = 0;
		for (salesAmount = 0; commission < commisionSought; salesAmount += 0.01) {
			balance = commission = 0;
			salesAmount += 0.01;

			if (salesAmount > 10000)
				commission += (balance = salesAmount - 10000) * 0.12;

			if (salesAmount > 5000)
				commission += (balance -= balance - 5000) * 0.10;

			if (salesAmount > 0)
				commission += balance * 0.08;

		}
			;

		System.out.printf("%.2f", salesAmount);

	}
}

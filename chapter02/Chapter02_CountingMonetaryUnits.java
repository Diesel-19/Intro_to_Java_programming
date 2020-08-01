package chapter02;

import java.util.Scanner;

public class Chapter02_CountingMonetaryUnits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of money: ");
		double money = input.nextDouble();

		int totalCents = (int) (money * 100);

		int dollars = totalCents / 100;
		int remainingCents = totalCents % 100;

		int quarters = remainingCents / 25;
		remainingCents %= 25;

		int dimes = remainingCents / 10;
		remainingCents %= 10;

		int nickels = remainingCents / 5;
		remainingCents %= 5;

		int cents = remainingCents;

		System.out.println(money + " dollars is: \n" + dollars + " dollars\n" + quarters + " quarters\n" + dimes
				+ " dimes\n" + nickels + " nickels\n" + cents + " cents");

	}

}

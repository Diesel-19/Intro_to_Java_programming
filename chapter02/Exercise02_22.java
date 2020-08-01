package chapter02;

import java.util.Scanner;

public class Exercise02_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of cents: ");
		int cents = input.nextInt();

		int dollars = cents / 100;
		int remainingCents = cents % 100;

		int quarters = remainingCents / 25;
		remainingCents %= 25;

		int dimes = remainingCents / 10;
		remainingCents %= 10;

		int nickels = remainingCents / 5;
		remainingCents %= 5;

		System.out.println(cents + " cents is: \n" + dollars + " dollars\n" + quarters + " quarters\n" + dimes
				+ " dimes\n" + nickels + " nickels\n" + remainingCents + " cents");
	}
}
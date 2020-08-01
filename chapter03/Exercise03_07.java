package chapter03;

import java.util.Scanner;

public class Exercise03_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of money: ");
		double money = input.nextDouble();

		int totalCents = (int) (money * 100);

		int dollars = totalCents / 100;
		int remainingCents = totalCents % 100;

		if (dollars == 0) {
		} else if (dollars == 1) {
			System.out.println(dollars + " dollar");
		} else {
			System.out.println(dollars + " dollars");
		}
		
		int quarters = remainingCents / 25;
		remainingCents %= 25;
		
		if (quarters == 0) {
		} else if (quarters == 1) {
			System.out.println(quarters + " quarter");
		} else {
			System.out.println(quarters + " quarters");
		}

		int dimes = remainingCents / 10;
		remainingCents %= 10;
		
		if (dimes == 0) {
		} else if (dimes == 1) {
			System.out.println(dimes + " dime");
		} else {
			System.out.println(dimes + " dimes");
		}

		int nickels = remainingCents / 5;
		remainingCents %= 5;
		
		if (nickels == 0) {
		} else if (nickels == 1) {
			System.out.println(nickels + " nickel");
		} else {
			System.out.println(nickels + " nickels");
		}

		int cents = remainingCents;
		
		if (cents == 0) {
		} else if (cents == 1) {
			System.out.println(cents + " cent");
		} else {
			System.out.println(cents + " cents");
		}
	}
}

package chapter03;

import java.util.Scanner;

public class Exercise03_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchange = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int direction = input.nextInt();

		double dollars;
		double rmb;

		if (direction == 0) {
			System.out.println("Enter the dollar amount: ");
			dollars = input.nextDouble();
			rmb = dollars * exchange;
			System.out.println(dollars + " dollars is " + rmb + " yuan");
			
		} else if (direction == 1) {
			System.out.println("Enter the RMB amount: ");
			rmb = input.nextDouble();
			dollars = rmb / exchange;
			System.out.println(rmb + " RMB is " + dollars + " dollars");
		} else {
			System.out.println("Incorrect input.");
		}
	}

}

package chapter04;

import java.util.Scanner;

public class Exercise04_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount: ");
		String amount = input.nextLine();

		char ch = ',';
		int x = amount.indexOf(ch);

		String dollars = amount.substring(0, x);
		String centsString = amount.substring(x + 1);

		int centsInt = Integer.parseInt(centsString);

		int twentyfive = centsInt / 25;
		int remaining = centsInt % 25;

		int ten = remaining / 10;
		remaining %= 10;

		int five = remaining / 5;
		remaining %= 5;

		int cent = remaining;

		System.out.println(dollars + " dollars\n" + twentyfive + " twentyfives\n" + ten + " tens\n" + five + " fives\n"
				+ cent + " cents");
	}

}

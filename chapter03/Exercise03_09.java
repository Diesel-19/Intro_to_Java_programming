package chapter03;

import java.util.Scanner;

public class Exercise03_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int nineDigits = input.nextInt();

		int d1 = nineDigits / (int) (Math.pow(10, 8));
		int remaining = nineDigits % (int) (Math.pow(10, 8));

		int d2 = remaining / (int) (Math.pow(10, 7));
		remaining %= (int) (Math.pow(10, 7));

		int d3 = remaining / (int) (Math.pow(10, 6));
		remaining %= (int) (Math.pow(10, 6));

		int d4 = remaining / (int) (Math.pow(10, 5));
		remaining %= (int) (Math.pow(10, 5));

		int d5 = remaining / (int) (Math.pow(10, 4));
		remaining %= (int) (Math.pow(10, 4));

		int d6 = remaining / (int) (Math.pow(10, 3));
		remaining %= (int) (Math.pow(10, 3));

		int d7 = remaining / (int) (Math.pow(10, 2));
		remaining %= (int) (Math.pow(10, 2));

		int d8 = remaining / (int) (Math.pow(10, 1));
		remaining %= (int) (Math.pow(10, 1));

		int d9 = remaining;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if (d1 != 0) {
			if (d10 == 10) {
				System.out.println("The ISBN-10 number is " + nineDigits + "X");
			} else {
				System.out.println("The ISBN-10 number is " + (nineDigits * 10 + d10));
			}
		} else if (d10 == 10) {
			System.out.println("The ISBN-10 number is " + d1 + nineDigits + "X");
		} else {
			System.out.println("The ISBN-10 number is " + d1 + (nineDigits * 10 + d10));
		}
	}
}

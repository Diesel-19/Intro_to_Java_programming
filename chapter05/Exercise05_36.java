package chapter05;

import java.util.Scanner;

public class Exercise05_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int nineDigits = input.nextInt();
		int remaining = nineDigits;
		int d10 = 0;
		String isbn = "";
		for (int i = 8; i >= 0; i--) {
			int d1 = remaining / (int) (Math.pow(10, i));
			remaining %= (int) (Math.pow(10, i));
			isbn += d1;
			d10 += d1 * (9 - i);
		}
		if (d10 % 11 != 10) {
			isbn += (d10 % 11);
		} else {
			isbn += "X";
		}
		System.out.println(isbn);
	}
}

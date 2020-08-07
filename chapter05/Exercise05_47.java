package chapter05;

import java.util.Scanner;

public class Exercise05_47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String str = input.nextLine();
		int sum = 0;
		if (str.length() != 12) {
		}
		for (int i = 0; i < 12; i++) {
			char ch = str.charAt(i);

			if (ch < 48 || 57 < ch || str.length() != 12) {
				System.err.println("Wrong Input");
				System.exit(0);
			}
			int d = (int) ch - 48;
			if (i % 2 == 1) {
				d = 3 * d;
			}
			sum += d;
		}
		int d12 = 10 - sum % 10;
		if (d12 == 10) {
			d12 = 0;
		}
		System.out.println(str + d12);
	}
}

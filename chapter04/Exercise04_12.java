package chapter04;

import java.util.Scanner;

public class Exercise04_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a hex digit: ");
		String hex = input.next().toUpperCase();

		if (hex.length() != 1) {
			System.err.println("Incorrect input");
			System.exit(0);
		}

		char ch = hex.charAt(0);
		
		if (Character.isDigit(ch) == true) {
			int decimal = Integer.parseInt(hex);
			int lastDigit = decimal % 2;
			decimal /= 2;
			int secondDigit = decimal % 2;
			decimal /= 2;
			int firstDigit = decimal % 2;

			System.out.println((firstDigit * 100) + (secondDigit * 10) + lastDigit);
		}
		else if (65 <= ch && ch <= 70) {
			String a = "" + (char) (ch - 17);
			int decimal = Integer.parseInt(a) + 10;

			int lastDigit = decimal % 2;
			decimal /= 2;
			int thirdDigit = decimal % 2;
			decimal /= 2;
			int secondDigit = decimal % 2;
			decimal /= 2;
			int firstDigit = decimal % 2;
			System.out.println((firstDigit * 1000) + (secondDigit * 100) + (thirdDigit * 10) + lastDigit);
		} else {
			System.err.println("Wrong input");
			System.exit(0);
		}

	}

}

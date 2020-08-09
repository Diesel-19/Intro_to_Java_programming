package chapter06;

import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number as a long integer: ");
		long number = input.nextLong();

		if (isValid(number)) {
			System.out.println("is valid");
		} else {
			System.out.println("is invalid");
		}
	}

	public static int sumOfDoubleEvenPlace(long number) {
		String n = "" + number;
		int sum = 0;
		String evenPlaces = "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			evenPlaces += n.charAt(i);
		}
		for (int i = 0; i < evenPlaces.length(); i++) {
			int doubleValue = i * 2;
			sum += getDigit(doubleValue);
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		String n = "" + number;
		int firstDigit;
		if (d > 9) {
			firstDigit = (int) getPrefix(number, 2);
		} else {
			firstDigit = (int) getPrefix(number, 1);
		}
		if (d == firstDigit) {
			return true;
		} else {
			return false;
		}
	}

	public static long getPrefix(long number, int k) {
		String n = "" + number;
		String firstKDigits;
		if (k < n.length()) {
			firstKDigits = n.substring(0, k);
		} else {
			firstKDigits = n;
		}
		return Integer.parseInt(firstKDigits);
	}

	public static int getDigit(int doubleValue) {
		int sumOfDigits;
		if (doubleValue > 9) {
			int firstDigit = doubleValue / 10;
			int secondDigit = doubleValue % 10;
			sumOfDigits = firstDigit + secondDigit;
		} else {
			sumOfDigits = doubleValue;
		}
		return sumOfDigits;
	}

	public static int getSize(long d) {
		String n = "" + d;
		return n.length();
	}

	public static int sumOfOddPlace(long number) {
		String n = "" + number;
		String odd = "";
		int sum = 0;
		for (int i = n.length() - 1; i >= 0; i -= 2) {
			odd = "" + n.charAt(i);
			int a = Integer.parseInt(odd);
			sum += a;
		}
		return sum;
	}

	public static boolean isValid(long number) {
		String n = "" + number;
		if (((sumOfOddPlace(number) + sumOfDoubleEvenPlace(number)) % 10 == 0) && (prefixMatched(number, 4)
				|| prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6))
				&& (13 <= getSize(number) && getSize(number) <= 16)) {
			return true;
		} else {
			return false;
		}
	}
}

package chapter06;

import java.util.Scanner;

public class Exercise06_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("■ A password must have at least eight characters.\r\n"
				+ "■ A password consists of only letters and digits.\r\n"
				+ "■ A password must contain at least two digits.");
		System.out.println("Enter password: ");
		String password = input.nextLine();
		if (checkPassword(password)) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}

	}

	public static boolean checkPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		int digitCount = 0;
		for (int i = 0; i < password.length(); i++) {

			if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
				return false;
			}
			if (Character.isDigit(password.charAt(i))) {
				digitCount++;
			}
		}
		if (digitCount < 2) {
			return false;
		}
		return true;
	}
}

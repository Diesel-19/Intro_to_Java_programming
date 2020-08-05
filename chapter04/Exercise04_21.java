package chapter04;

import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN: ");
		String ssn = input.nextLine();

		boolean valid = ssn.length() == 11 && Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1))
				&& Character.isDigit(ssn.charAt(2)) && Character.isDigit(ssn.charAt(4))
				&& Character.isDigit(ssn.charAt(5)) && Character.isDigit(ssn.charAt(7))
				&& Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9))
				&& Character.isDigit(ssn.charAt(10)) && (ssn.charAt(3) == '-') && (ssn.charAt(6) == '-');
		if (valid) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}

	}

}

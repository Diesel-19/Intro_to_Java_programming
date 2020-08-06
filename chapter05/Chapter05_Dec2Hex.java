package chapter05;

import java.util.Scanner;

public class Chapter05_Dec2Hex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal number: ");
		int decimal = input.nextInt();

		String hex = "";
		do {
			int hexValue = decimal % 16;
			decimal /= 16;

			char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
			hex = hexDigit + hex;

		} while (decimal != 0);
		System.out.println(hex);
	}

}

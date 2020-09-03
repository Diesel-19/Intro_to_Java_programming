package chapter12.Exercise07;

import java.util.Scanner;

public class Binary2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binaryString = input.nextLine();
		System.out.println(bin2Dec(binaryString));
	}

	public static int bin2Dec(String binaryString) {
		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new NumberFormatException();
			}
			decimalValue = decimalValue * 2 + (binaryString.charAt(i) - 48);
		}

		return decimalValue;
	}
}

package chapter05;

import java.util.Scanner;

public class Exercise05_44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a short decimal integer: ");
		short decimal = input.nextShort();

		String binary = "";
		while (decimal != 0) {
			binary = (decimal % 2) + binary;
			decimal = (short) (decimal / 2);
		}
		System.out.printf(binary);
		for (int i = 0; i < 16; i++) {
		}
	}
}

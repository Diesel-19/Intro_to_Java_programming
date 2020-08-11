package chapter05;

import java.util.Scanner;

public class Exercise05_44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a short decimal integer: ");
		short decimal = input.nextShort();

		String str = "";

		for (int i = 0; i < 16; i++) {
			str = (decimal & 1) + str;
			decimal >>= 1;
		}

		System.out.println(str);
	}
}

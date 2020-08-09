package chapter06;

import java.util.Scanner;

public class Exercise06_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number and the number: ");
		int number = input.nextInt();
		int width = input.nextInt();

		System.out.println(format(number, width));
	}

	public static String format(int number, int width) {
		String num = "" + number;

		if (num.length() >= width) {
			return num;
		} else {
			while (width > num.length()) {
				num = "0" + num;
			}
			return num;
		}
	}
}

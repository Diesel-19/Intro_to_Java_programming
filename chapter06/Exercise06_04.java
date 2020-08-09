package chapter06;

import java.util.Scanner;

public class Exercise06_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer to reverse it: ");
		int number = input.nextInt();

		reverse(number);
	}

	public static void reverse(int number) {
		String num = "" + number;
		String reverse = "";
		for (int i = 0; i < num.length(); i++) {
			reverse += num.charAt(num.length() - 1 - i);
		}
		System.out.println(reverse);
	}
}

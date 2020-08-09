package chapter06;

import java.util.Scanner;

public class Exercise06_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();

		System.out.println("Enter a char: ");
		char ch = input.nextLine().charAt(0);

		System.out.println(count(str, ch) + " number of times");
	}

	private static int count(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}

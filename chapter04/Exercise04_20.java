package chapter04;

import java.util.Scanner;

public class Exercise04_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();

		char ch = str.charAt(0);
		System.out.println(str.length() + " characters long and the first letter is: " + ch);
	}
}
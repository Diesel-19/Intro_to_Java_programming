package chapter05;

import java.util.Scanner;

public class Exercise05_51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1 = input.nextLine();

		System.out.println("Enter second string: ");
		String str2 = input.nextLine();

		String answer = "";
		for (int i = 1; i <= str1.length() || i <= str2.length(); i++) {
			String firstPart = str1.substring(0, i);
			String secondPart = str2.substring(0, i);
			boolean isEqual = firstPart.equals(secondPart);
			if (isEqual == true) {
				answer = str1.substring(0, i);
			} else {
				break;
			}

		}
		if (answer.length() == 0) {
			System.out.println("no common prefix");
		} else {
			System.out.println(answer);
		}
	}
}

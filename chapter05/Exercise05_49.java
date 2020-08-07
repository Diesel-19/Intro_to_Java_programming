package chapter05;

import java.util.Scanner;

public class Exercise05_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine().toUpperCase();
		String vowels = "AEIOU";
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String temp = "" + ch;

			if (vowels.contains(temp)) {
				vowelCount++;
			} else if (65 <= ch && ch <= 90) {
				consonantCount++;
			}
		}
		System.out.println("Vowel count: " + vowelCount + "\nConsonant count: " + consonantCount);
	}
}

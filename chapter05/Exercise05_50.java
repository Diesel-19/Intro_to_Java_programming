package chapter05;

import java.util.Scanner;

public class Exercise05_50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (65 <= ch && ch <= 90) {
				counter++;
			}
		}
		System.out.println("Number of uppercase letters: " + counter);
	}
}

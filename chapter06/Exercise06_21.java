package chapter06;

import java.util.Scanner;

public class Exercise06_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine().toUpperCase();
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				answer += getNumber(ch);
			} else {
				answer += ch;
			}
		}
		System.out.println(answer);
	}

	public static int getNumber(char ch) {
		if ('A' <= ch && ch <= 'C') {
			return 2;
		} else if ('D' <= ch && ch <= 'F') {
			return 3;
		} else if ('G' <= ch && ch <= 'I') {
			return 4;
		} else if ('J' <= ch && ch <= 'L') {
			return 5;
		} else if ('M' <= ch && ch <= 'O') {
			return 6;
		} else if ('P' <= ch && ch <= 'S') {
			return 7;
		} else if ('T' <= ch && ch <= 'V') {
			return 8;
		} else {
			return 9;
		}
	}
}

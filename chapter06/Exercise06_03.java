package chapter06;

import java.util.Scanner;

public class Exercise06_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer to check if it is a palindrome: ");
		int number = input.nextInt();
		
		if (isPalindrome(number)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

	public static int reverse(int number) {
		String num = "" + number;
		String reverse = "";
		for (int i = 0; i < num.length(); i++) {
			reverse += num.charAt(num.length() - 1 - i);
		}
		int reversed = Integer.parseInt(reverse);
		return reversed;
	}

	public static boolean isPalindrome(int number) {
		String num = "";
		boolean isPalindrome = true;
		if (number != reverse(number)) {
			isPalindrome = false;
		}
		return isPalindrome;
	}
}

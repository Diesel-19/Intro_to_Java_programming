package chapter05;

import java.util.Scanner;

public class Chapter05_Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine().trim();

		String reversed;
		int i = 0;
		boolean isPalindrome = true;
		while (i < str.length()/ 2 && isPalindrome) {
			isPalindrome = (str.charAt(i) == str.charAt(str.length() - i - 1));
			i++;
		}
		if (i == str.length() / 2 && isPalindrome) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}

}

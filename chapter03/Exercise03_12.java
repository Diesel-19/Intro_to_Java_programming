package chapter03;

import java.util.Scanner;

public class Exercise03_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three digit integer: ");
		int number = input.nextInt();
		
		int d1 = number / 100;
		int remaining = number % 100;
		
		int d2 = remaining / 10;
		remaining %= 10;
		
		int d3 = remaining;
		
		if (100 * d1 + 10 * d2 + d3 == 100 * d3 + 10 * d2 + d1) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " isn't a palindrome");
		}
	}
}
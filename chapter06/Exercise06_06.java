package chapter06;

import java.util.Scanner;

public class Exercise06_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = input.nextInt();

		displayPattern(n);
	}

	private static void displayPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i - 1; k++) {
				System.out.print("  ");
			}
			for (int k = i + 1; k > 0; k--) {
				System.out.printf("%-2d",k);
			}
			System.out.println();
		}
	}

}

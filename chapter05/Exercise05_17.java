package chapter05;

import java.util.Scanner;

public class Exercise05_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of lines: ");
		int lines = input.nextInt();
		for (int k = 1; k < lines + 1; k++) {

			for (int m = 0; m < lines - k; m++) {
				System.out.print("  ");
			}

			for (int i = k; i > 0; i--) {
				System.out.print(i + " ");
			}
			for (int i = 2; i < k + 1; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
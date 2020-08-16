package chapter07;

import java.util.Scanner;

public class Exercise07_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of numbers you want to exclude: ");
		int size = input.nextInt();
		int[] excluded = new int[size];
		System.out.println("Enter the numbers you want to exclude");
		for (int i = 0; i < size; i++) {
			excluded[i] = input.nextInt();
		}
		System.out.print(getRandom(excluded));
	}

	public static int getRandom(int[] excluded) {
		int random = 0;
		boolean isExcluded;
		do {
			isExcluded = true;
			random = (int) (Math.random() * 54) + 1;
			for (int i = 0; i < excluded.length; i++) {
				if (random == excluded[i]) {
					isExcluded = false;
				}
			}
		} while (!isExcluded);

		return random;
	}
}

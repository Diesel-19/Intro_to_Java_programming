package chapter07;

import java.util.Scanner;

public class Exercise07_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of values: ");
		int size = input.nextInt();

		System.out.println("Enter the values: ");
		int[] values = new int[size];
		for (int i = 0; i < size; i++) {
			values[i] = input.nextInt();
		}
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		for (int i = 0; i < values.length - 3; i++) {
			if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3]) {
				return true;
			}
		}
		return false;
	}
}

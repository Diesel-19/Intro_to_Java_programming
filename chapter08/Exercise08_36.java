package chapter08;

import java.util.Scanner;

public class Exercise08_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n");
		int size = input.nextInt();
		char[][] matrix = new char[size][size];
		System.out.println("Enter " + size + " rows of letters separated by spaces:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				String ch = input.next();
				if (ch.charAt(0) < 65 || (64 + size) < ch.charAt(0)) {
					System.err.println(
							"Wrong input: the letters must be from " + (char) 65 + " to " + (char) (64 + size));
					System.exit(0);
				}
				matrix[i][j] = ch.charAt(0);
			}
		}
		if (isValid(matrix)) {
			System.out.println("The input array is a Latin square");
		} else {
			System.out.println("The input array is not a Latin square");
		}
	}

	public static boolean isValid(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length - 1; j++) {
				for (int j2 = j + 1; j2 < matrix.length; j2++) {
					if (matrix[i][j] == matrix[i][j2]) {
						return false;
					}
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int i = 0; i < matrix.length - 1; i++) {
				for (int i2 = i + 1; i2 < matrix.length; i2++) {
					if (matrix[i][j] == matrix[i2][j]) {
						return false;
					}
				}
			}
		}
		return true;
	}
}

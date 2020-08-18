package chapter08;

import java.util.Scanner;

public class Exercise08_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int row = input.nextInt();
		int column = input.nextInt();

		int[][] matrix = new int[row][column];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		if (isConsecutiveFour(matrix)) {
			System.out.println("There is a consecutive four");
		} else {
			System.out.println("There is no consecutive four");
		}
	}

	public static boolean isConsecutiveFour(int[][] matrix) {
		// check rows
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 3; j++) {
				if ((matrix[i][j] == matrix[i][j + 1]) && (matrix[i][j + 1] == matrix[i][j + 2])
						&& (matrix[i][j + 2] == matrix[i][j + 3])) {
					return true;
				}
			}
		}
		// check columns
		for (int j = 0; j < matrix[0].length; j++) {
			for (int i = 0; i < matrix.length - 3; i++) {
				if ((matrix[i][j] == matrix[i + 1][j]) && (matrix[i + 1][j] == matrix[i + 2][j])
						&& (matrix[i + 2][j] == matrix[i + 3][j])) {
					return true;
				}
			}
		}
		// check major diagonals
		for (int i = 0; i < matrix.length - 3; i++) {
			for (int j = 0; j < matrix[0].length - 3; j++) {
				if ((matrix[i][j] == matrix[i + 1][j + 1]) && (matrix[i + 1][j + 1] == matrix[i + 2][j + 2])
						&& (matrix[i + 2][j + 2] == matrix[i + 3][j + 3])) {
					return true;
				}
			}
		}
		// check sub-diagonals
		for (int i = 3; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 3; j++) {
				if ((matrix[i][j] == matrix[i - 1][j + 1]) && (matrix[i - 1][j + 1] == matrix[i - 2][j + 2])
						&& (matrix[i - 2][j + 2] == matrix[i - 3][j + 3])) {
					return true;
				}
			}
		}
		return false;
	}
}

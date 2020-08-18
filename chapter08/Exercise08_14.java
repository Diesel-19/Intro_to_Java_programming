package chapter08;

import java.util.Scanner;

public class Exercise08_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the matrix");
		int size = input.nextInt();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		printMatrix(matrix);
		System.out.println();
		printSimilarities(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void printSimilarities(int[][] matrix) {

		printRowSimilaraties(matrix);

		printColumnSimilaraties(matrix);

		printDiagonalSimilaraties(matrix);
	}

	private static void printDiagonalSimilaraties(int[][] matrix) {
		printMajorDiagonalSimilarities(matrix);
		printSubDiagonalSimilarities(matrix);
	}

	private static void printSubDiagonalSimilarities(int[][] matrix) {
		boolean allSame = true;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][matrix.length - i - 1] != matrix[0][matrix.length - 1]) {
				allSame = false;
			}
		}
		if (allSame) {
			System.out.println("All " + matrix[0][matrix.length - 1] + "s on sub-diagonal");
		} else {
			System.out.println("No same numbers on the sub-diagonal");
		}
	}

	public static void printMajorDiagonalSimilarities(int[][] matrix) {
		boolean allSame = true;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] != matrix[0][0]) {
				allSame = false;
			}
		}
		if (allSame) {
			System.out.println("All " + matrix[0][0] + "s on major diagonal");
		} else {
			System.out.println("No same numbers on the major diagonal");
		}
	}

	private static void printColumnSimilaraties(int[][] matrix) {
		int count = 0;
		for (int j = 0; j < matrix.length; j++) {
			boolean allSame = true;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] != matrix[0][j]) {
					allSame = false;
				}
			}
			if (allSame) {
				System.out.println("All " + matrix[0][j] + "s on column " + j);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No same numbers on a column");
		}
	}

	public static void printRowSimilaraties(int[][] matrix) {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			boolean allSame = true;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[i][0]) {
					allSame = false;
				}
			}
			if (allSame) {
				System.out.println("All " + matrix[i][0] + "s on row " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No same numbers on a row");
		}
	}
}

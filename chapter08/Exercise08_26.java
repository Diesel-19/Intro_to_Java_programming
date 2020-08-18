package chapter08;

import java.util.Scanner;

public class Exercise08_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix");
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		double[][] sorted = sortRows(matrix);
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[0].length; j++) {
				System.out.print(sorted[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] matrix) {
		double[][] sorted = new double[matrix.length][matrix[0].length];
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[0].length; j++) {
				sorted[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < sorted.length; i++) {
			java.util.Arrays.sort(sorted[i]);
		}
		return sorted;
	}
}

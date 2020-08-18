package chapter08;

import java.util.Scanner;

public class Exercise08_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix");
		double[][] matrix = new double[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		double[][] sorted = sortColumns(matrix);
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[0].length; j++) {
				System.out.print(sorted[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortColumns(double[][] matrix) {
		double[][] sorted = new double[matrix.length][matrix[0].length];
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[0].length; j++) {
				sorted[i][j] = matrix[i][j];
			}
		}
		double[] temp = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				temp[j] = sorted[j][i];
			}
			java.util.Arrays.sort(temp);
			for (int j = 0; j < temp.length; j++) {
				sorted[j][i] = temp[j];
			}
		}
		return sorted;
	}

}

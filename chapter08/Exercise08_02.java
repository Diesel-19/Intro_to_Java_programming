package chapter08;

import java.util.Scanner;

public class Exercise08_02 {
	public static void main(String[] args) {
		int n = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + n + "-by-" + n + "matrix row by row");
		double[][] matrix = new double[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) { // here: matrix[0]length = matrix.length
				matrix[i][j] = input.nextDouble();
			}
		}

		double sum = sumMajorDiagonal(matrix);
		System.out.println(sum);
	}

	public static double sumMajorDiagonal(double[][] matrix) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}
}

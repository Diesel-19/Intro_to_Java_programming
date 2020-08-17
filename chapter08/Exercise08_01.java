package chapter08;

import java.util.Scanner;

public class Exercise08_01 {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + rows + "-by-" + columns + "matrix row by row:");
		double[][] matrix = new double[rows][columns];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}

		for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
			double sum = sumColumn(matrix, columnIndex);
			System.out.println("Sum of column " + columnIndex + " is: " + sum);
		}

	}

	public static double sumColumn(double[][] matrix, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][columnIndex];
		}
		return sum;
	}
}

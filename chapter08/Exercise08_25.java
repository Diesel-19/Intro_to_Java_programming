package chapter08;

import java.util.Scanner;

public class Exercise08_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 3;
		double[][] matrix = new double[size][size];
		System.out.println("Enter a 3by3 matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		if (isMarkovMatrix(matrix)) {
			System.out.println("It is a Markov matrix");
		} else {
			System.out.println("It is not a Markov matrix");
		}
	}

	public static boolean isMarkovMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] <= 0) {
					return false;
				}
			}
		}
		for (int j = 0; j < matrix.length; j++) {
			double sum = 0;
			for (int i = 0; i < matrix.length; i++) {
				sum += matrix[i][j];
			}
			if (sum != 1) {
				return false;
			}
		}
		return true;
	}
}

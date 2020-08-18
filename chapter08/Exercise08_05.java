package chapter08;

import java.util.Scanner;

public class Exercise08_05 {

	public static void main(String[] args) {
		int n = 3;
		double[][] matrix1 = new double[n][n];
		double[][] matrix2 = new double[n][n];
		getInput(matrix1, matrix2);
		double[][] matrix3 = addMatrix(matrix1, matrix2);

		printMatrices(matrix1, matrix2, matrix3);
	}

	public static void getInput(double[][] matrix1, double[][] matrix2) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
	}

	public static void printMatrices(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			if (i == 1) {
				System.out.print(" + ");
			} else {
				System.out.print("   ");
			}
			for (int j = 0; j < matrix2.length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			if (i == 1) {
				System.out.print(" = ");
			} else {
				System.out.print("   ");
			}
			for (int j = 0; j < matrix3.length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
		double[][] matrix3 = new double[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrix3;
	}

}

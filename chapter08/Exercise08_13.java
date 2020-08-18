package chapter08;

import java.util.Scanner;

public class Exercise08_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] matrix = new double[row][column];
		System.out.println("Enter the array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		int[] location = locateLargest(matrix);
		System.out.println("The location of the largest element is at: (" + location[0] + ", " + location[1] + ")");

	}

	public static int[] locateLargest(double[][] a) {
		int[] location = new int[2];
		double max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}

		return location;
	}
}

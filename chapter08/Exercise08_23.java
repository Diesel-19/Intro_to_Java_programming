package chapter08;

import java.util.Scanner;

public class Exercise08_23 {
	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int row = checkRowFor1s(matrix);
		int column = checkColumnFor1s(matrix);
		System.out.println("The flipped cell is at (" + row +", " + column + ")");

	}

	public static int checkColumnFor1s(int[][] matrix) {
		for (int j = 0; j < matrix[0].length; j++) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return j;
			}
		}
		return -1;
	}

	public static int checkRowFor1s(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return i;
			}
		}
		return -1;
	}

}

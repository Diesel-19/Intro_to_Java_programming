package chapter08;

import java.util.Scanner;

public class Exercise08_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int employeeAmount = input.nextInt();
		int[][] matrix = new int[employeeAmount][7];
		System.out.println("Enter employee's work hours");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		int sums[][] = getSum(matrix);
		sort(sums);
		for (int i = 0; i < sums.length; i++) {
			for (int j = 0; j < sums[0].length; j++) {
				System.out.print(sums[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] getSum(int[][] matrix) {
		int[][] sums = new int[matrix.length][2];
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}
			sums[i][0] = i;
			sums[i][1] = sum;
		}
		return sums;
	}

	public static void sort(int[][] matrix) {
		int[] temp = new int[2];
		for (int i = 0; i < matrix.length - 1; i++) {
			int max = matrix[i][1];
			int maxIndex = i;
			for (int j = i + 1; j < matrix.length; j++) {
				if (max < matrix[j][1]) {
					max = matrix[j][1];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				for (int j = 0; j < temp.length; j++) {
					temp[j] = matrix[maxIndex][j];
					matrix[maxIndex][j] = matrix[i][j];
					matrix[i][j] = temp[j];
				}
			}
		}
	}
}

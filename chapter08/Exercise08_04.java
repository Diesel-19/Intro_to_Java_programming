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
		int sums[] = getSum(matrix);
		for (int i : sums) {
			System.out.println(i);
		}
		//TODO sort
	}

	public static int[] getSum(int[][] matrix) {
		int[] sums = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				sum += matrix[i][j];
			}
			sums[i] = sum;
		}
		return sums;
	}
}

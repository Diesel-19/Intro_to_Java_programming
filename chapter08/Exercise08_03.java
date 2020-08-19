package chapter08;

import java.util.Arrays;

public class Exercise08_03 {
	public static void main(String[] args) {
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		int[][] studentPoints = new int[answers.length][2];

		for (int i = 0; i < answers.length; i++) {
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					studentPoints[i][0] = i;
					studentPoints[i][1]++;
				}
			}
		}
		sort(studentPoints);
		for (int i = 0; i < studentPoints.length; i++) {
			for (int j = 0; j < studentPoints[0].length; j++) {
				System.out.print(studentPoints[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sort(int[][] studentPoints) {
		int[] temp = new int[2];
		for (int i = 0; i < studentPoints.length - 1; i++) {
			int min = studentPoints[i][1];
			int minIndex = i;
			for (int j = i + 1; j < studentPoints.length; j++) {
				if (studentPoints[j][1] < min) {
					min = studentPoints[j][1];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				for (int j = 0; j < temp.length; j++) {
					temp[j] = studentPoints[minIndex][j];
					studentPoints[minIndex][j] = studentPoints[i][j];
					studentPoints[i][j] = temp[j];
				}
			}
		}
	}
}

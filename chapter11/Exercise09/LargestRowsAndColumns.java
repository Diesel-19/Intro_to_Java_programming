package chapter11.Exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = input.nextInt();

		int[][] matrix = new int[n][n];

		fill(matrix);
		print(matrix);

		System.out.print("The largest row index: ");
		print(largestRow(matrix));
		System.out.print("The largest column index: ");
		print(largestColumn(matrix));
	}

	public static void print(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static ArrayList<Integer> largestColumn(int[][] matrix) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	public static ArrayList<Integer> largestRow(int[][] matrix) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == x)
				list.add(i);
		}
	}

	public static void fill(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void print(int[][] array) {
		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}

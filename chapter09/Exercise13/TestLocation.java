package chapter09.Exercise13;

import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter row and column");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] a = new double[row][column];

		System.out.println("Enter matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}

		Location max = locateLargest(a);
		System.out.println("Largest element " + max.maxValue + "\nRow: " + max.row + " column: " + max.column);
	}

	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}
}

package chapter08;

import java.util.Scanner;

public class Exercise08_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] a = new double[2][2];
		double[] b = new double[2];
		System.out.println("Enter 2 by 2 a");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter 2 b");
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextDouble();
		}
		double[] solution = linearEquation(a, b);
		if (solution == null) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("x is: " + solution[0]);
			System.out.println("y is: " + solution[1]);
		}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double[] solution = new double[2];
		if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0) {
			return null;
		}
		solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		solution[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		return solution;
	}
}

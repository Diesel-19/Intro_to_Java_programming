package chapter08;

import java.util.Scanner;

public class Exercise08_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 3;
		double[][] m1 = new double[size][size];
		double[][] m2 = new double[size][size];
		System.out.println("Enter matrix 1");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix 2");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				m2[i][j] = input.nextDouble();
			}
		}
		double[][] m3 = multiplyMatrix(m1, m2);
		printProcess(m1, m2, m3);
	}

	public static void printProcess(double[][] m1, double[][] m2, double[][] m3) {
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3.length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			if (i == 1) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
			for (int j = 0; j < m3.length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			if (i == 1) {
				System.out.print("= ");
			} else {
				System.out.print("  ");
			}
			for (int j = 0; j < m3.length; j++) {
				System.out.print((int) (m3[i][j] * 10) / 10. + " ");
			}
			System.out.println();
		}
	}

	public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {
		double[][] m3 = new double[m1.length][m1.length];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				for (int j2 = 0; j2 < m3.length; j2++) {
					m3[i][j] += m1[i][j2] * m2[j2][j];
				}
			}
		}

		return m3;
	}
}

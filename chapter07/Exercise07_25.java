package chapter07;

import java.util.Scanner;

public class Exercise07_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coefficients: ");
		double[] eqn = new double[3];
		for (int i = 0; i < 3; i++) {
			eqn[i] = input.nextDouble();
		}
		int numberOfRoots = getNumberOfRoots(eqn);
		double[] roots = new double[numberOfRoots];
		System.out.println("Number of roots: " + numberOfRoots);
		solveQuadratic(eqn, roots);
		for (double d : roots) {
			System.out.println(d);
		}
	}

	public static int getNumberOfRoots(double[] eqn) {
		int numberOfRoots;
		if (eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2] == 0) {
			numberOfRoots = 1;
		} else if (eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2] > 0) {
			numberOfRoots = 2;
		} else {
			numberOfRoots = 0;
		}
		return numberOfRoots;
	}

	public static double[] solveQuadratic(double[] eqn, double[] roots) {
		if (getNumberOfRoots(eqn) == 2) {
			roots[0] = (-eqn[1] - Math.sqrt(eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
			roots[1] = (-eqn[1] - Math.sqrt(eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
		} else if (getNumberOfRoots(eqn) == 1) {
			roots[0] = (-eqn[1] - Math.sqrt(eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
		} else {
			return null;
		}
		return roots;
	}
}

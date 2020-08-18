package chapter08;

import java.util.Scanner;

public class Exercise08_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter five points: ");
		double[][] points = new double[5][2];

		if (sameLine(points)) {
			System.out.println("on the same line");
		}

	}

	public static boolean sameLine(double[][] points) {
		double position = 0;
		if (position == 0) {
			return true;
		} else {
			return false;
		}
		// TODO calculate position
	}
}
package chapter09.Exercise11;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation k = new LinearEquation(a, b, c, d, e, f);

		if (!k.isSolvable()) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("X is: " + k.getX() + "\nY is: " + k.getY());
		}
	}
}

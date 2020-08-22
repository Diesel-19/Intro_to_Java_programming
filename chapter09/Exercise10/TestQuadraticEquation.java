package chapter09.Exercise10;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation q = new QuadraticEquation(a, b, c);
		if (q.getDiscriminant() > 0) {
			System.out.println("Root1 " + q.getRoot1());
			System.out.println("Root2 " + q.getRoot2());
		} else if (q.getDiscriminant() == 0) {
			System.out.println("Root1 " + q.getRoot1());
		} else {
			System.out.println("The equation has no roots");
		}
	}
}

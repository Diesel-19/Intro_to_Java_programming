package chapter03;

import java.util.Scanner;

public class Exercise03_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		if (Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5) <= 10) {
			System.out.println("The point is in the circle");
		} else {
			System.out.println("The point isn't in the circle");
		}
	}

}

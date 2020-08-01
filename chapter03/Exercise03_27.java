package chapter03;

import java.util.Scanner;

public class Exercise03_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if ((200 - x) / 200 < (y / 100) || x > 200 || y > 100) {
			System.out.println("The point isn't in the triangle");
		} else if (x <= 0 || y <= 0) {
			System.out.println("Please enter positive numbers");
		} else {
			System.out.println("The point is in the triangle");
		}
	}
}

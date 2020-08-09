package chapter06;

import java.util.Scanner;

public class Exercise06_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (!isValid(side1, side2, side3)) {
			System.out.println("Invalid input");
		} else {
			System.out.println("The area is: " + area(side1, side2, side3));
		}
	}

	private static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
			return true;
		}
		return false;
	}
	
	private static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;
	}

}

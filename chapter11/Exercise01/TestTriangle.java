package chapter11.Exercise01;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 sides of the triangle");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		Triangle o1 = new Triangle(side1, side2, side3);
		input.nextLine();
		System.out.println("Enter color");
		String color = input.nextLine();
		o1.setColor(color);

		System.out.println("Enter filled state");
		boolean filled = input.nextBoolean();
		o1.setFilled(filled);

		System.out.println(o1.toString());
		System.out.println("Area: " + o1.getArea());
		System.out.println("Color: " + o1.getColor());
		System.out.println("Is filled: " + o1.isFilled());

	}
}

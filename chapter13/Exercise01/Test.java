package chapter13.Exercise01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		input.nextLine();
		System.out.println("Enter color");
		String color = input.nextLine();

		System.out.println("Enter if it is filled or not");
		boolean filled = input.nextBoolean();

		input.close();
		System.out.println(new Triangle(side1, side2, side3, color, filled).toString());
	}
}

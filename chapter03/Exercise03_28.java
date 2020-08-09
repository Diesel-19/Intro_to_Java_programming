package chapter03;

import java.util.Scanner;

public class Exercise03_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter r1's center x-, y-coordinates, width and height");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();

		System.out.println("Enter r2's center x-, y-coordinates, width and height");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		if ((Math.abs(y2 - y1) + height2 / 2 <= height1 / 2) && (Math.abs(x2 - x1) + width2 / 2 <= width1 / 2)
				&& (height1 / 2 + height2 / 2 <= height1) && (width1 / 2 + width2 / 2 <= width1))
			System.out.println("r2 is inside r1");
		else if ((x1 + width1 / 2 > x2 - width2) || (y1 + height1 / 2 > y2 - height2))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
	}
}
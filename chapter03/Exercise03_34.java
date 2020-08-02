package chapter03;

import java.util.Scanner;

public class Exercise03_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for p0, p1 and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		double p0MinusP1 = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		double p0MinusP2 = Math.sqrt((x2 - x0) * (x2 - x0) + (y2 - y0) * (y2 - y0));
		double p1MinusP2 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		boolean onLineSegment = Math.rint((p0MinusP2 + p1MinusP2) * 100) / 100 == Math.rint(p0MinusP1 * 100) / 100;

		System.out.println(onLineSegment);

		if (position != 0 || !onLineSegment) {
			System.out.println("Not on the line segment");
		} else {
			System.out.println("On line segment");
		}
	}

}

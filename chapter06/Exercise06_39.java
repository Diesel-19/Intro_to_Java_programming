package chapter06;

import java.util.Scanner;

public class Exercise06_39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for p0, p1, p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("on the left side of the line");
		} else if (!leftOfTheLine(x0, y0, x1, y1, x2, y2) && !onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("on the right side of the line");
		} else if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.println("on the line segment");
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("on the same line");
		}

	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (position > 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (position == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		double p0MinusP1 = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
		double p0MinusP2 = Math.sqrt((x2 - x0) * (x2 - x0) + (y2 - y0) * (y2 - y0));
		double p1MinusP2 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		boolean onLineSegment = Math.rint((p0MinusP2 + p1MinusP2) * 100) / 100 == Math.rint(p0MinusP1 * 100) / 100;
		return onLineSegment;
	}
}

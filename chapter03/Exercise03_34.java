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
		boolean onLineSegment = (Math.pow(Math.pow((x2 - x0), 2) + Math.pow((y2 - y0), 2), 0.5))
				+ (Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5)) == (Math
						.pow(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2), 0.5));
		
		System.out.println(onLineSegment);
		System.out.println(position);
		
		if (position != 0 || !onLineSegment) {
			System.out.println("Not on the line segment");
		} else {
			System.out.println("On line segment");
		}
	}

}

package chapter08;

import java.util.Scanner;

public class Exercise08_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		double[] intersectingPoint = getIntersectingPoint(points);
		if (intersectingPoint == null) {
			System.out.println("The points are parallel");
		} else {
			for (int i = 0; i < intersectingPoint.length; i++) {
				System.out.printf("%.2f ", intersectingPoint[i]);
			}
		}

	}

	public static double[] getIntersectingPoint(double[][] points) {
		double a = points[0][1] - points[1][1];
		double b = points[1][0] - points[0][0];
		double c = points[2][1] - points[3][1];
		double d = points[3][0] - points[2][0];
		double e = (points[0][1] - points[1][1]) * points[0][0] - points[0][1] * (points[0][0] - points[1][0]);
		double f = points[2][0] * (points[2][1] - points[3][1]) - points[2][1] * (points[2][0] - points[3][0]);
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		double[] intersectingPoint = { x, y };
		if (a * d - b * c == 0) {
			return null;
		} else {
			return intersectingPoint;
		}
	}
}

package chapter08;

import java.util.Scanner;

public class Exercise08_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4");
		double[][] points = new double[4][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		double[] intersectingPoint = getIntersectingPoint(points);
		double[][] triangle1 = { { intersectingPoint[0], intersectingPoint[1] }, { points[1][0], points[1][1] },
				{ points[2][0], points[2][1] } };
		double[][] triangle2 = { { intersectingPoint[0], intersectingPoint[1] }, { points[1][0], points[1][1] },
				{ points[0][0], points[0][1] } };
		double[][] triangle3 = { { intersectingPoint[0], intersectingPoint[1] }, { points[3][0], points[3][1] },
				{ points[0][0], points[0][1] } };
		double[][] triangle4 = { { intersectingPoint[0], intersectingPoint[1] }, { points[2][0], points[2][1] },
				{ points[3][0], points[3][1] } };
		double area1 = getTriangleArea(triangle1);
		double area2 = getTriangleArea(triangle2);
		double area3 = getTriangleArea(triangle3);
		double area4 = getTriangleArea(triangle4);
		double[] areas = {area1, area2, area3, area4};
		java.util.Arrays.sort(areas);
		System.out.printf("The areas are %.2f %.2f %.2f %.2f", areas[0], areas[1], areas[2], areas[3]);
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double a = points[0][1] - points[2][1];
		double b = points[2][0] - points[0][0];
		double c = points[1][1] - points[3][1];
		double d = points[3][0] - points[1][0];
		double e = (points[0][1] - points[2][1]) * points[0][0] - points[0][1] * (points[0][0] - points[2][0]);
		double f = points[1][0] * (points[1][1] - points[3][1]) - points[1][1] * (points[1][0] - points[3][0]);
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		double[] intersectingPoint = { x, y };
		if (a * d - b * c == 0) {
			return null;
		} else {
			return intersectingPoint;
		}
	}

	public static double getTriangleArea(double[][] points) {
		double side1 = Math.pow((Math.pow(points[1][0] - points[0][0], 2)) + (Math.pow(points[1][1] - points[0][1], 2)),
				0.5);
		double side2 = Math.pow((Math.pow(points[1][0] - points[2][0], 2)) + (Math.pow(points[1][1] - points[2][1], 2)),
				0.5);
		double side3 = Math.pow((Math.pow(points[2][0] - points[0][0], 2)) + (Math.pow(points[2][1] - points[0][1], 2)),
				0.5);

		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;
	}
}

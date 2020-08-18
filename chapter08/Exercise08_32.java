package chapter08;

import java.util.Scanner;

public class Exercise08_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[3][2];
		System.out.println("Enter x1, y1, x2, y2, x3, y3");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[0].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		double area = getTriangleArea(points);
		System.out.printf("%.2f", area);
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
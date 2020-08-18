package chapter08;

import java.util.Scanner;

public class Exercise08_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cities");
		int cityAmount = input.nextInt();
		System.out.println("Enter the coordinates of the cities:");
		double[][] coordinates = new double[cityAmount][2];
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = 0; j < coordinates[0].length; j++) {
				coordinates[i][j] = input.nextDouble();
			}
		}
		double min = Double.MAX_VALUE;
		double sum = 0;
		int index = 0;
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = i + 1; j < coordinates.length; j++) {
				sum += calculateDistance(coordinates[i], coordinates[j]);
			}
			if (sum < min) {
				min = sum;
				index = i;
			}
		}
		System.out.println("The central city is at (" + coordinates[index][0] + ", " + coordinates[index][1] + ")");
		System.out.printf("The total distance to all other cities is %.2f", min);

	}

	private static double calculateDistance(double[] ds, double[] ds2) {
		double distance = Math.sqrt((ds[0] - ds2[0]) * (ds[0] - ds2[0]) + (ds[1] - ds2[1]) * (ds[1] - ds2[1]));
		return distance;
	}
}

package chapter03;

import java.util.Scanner;

public class Exercise03_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter circle1's center x, y coordinates and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.println("Enter circle2's center x, y coordinates and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		double distanceBetweenCenters = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		int bigOne = 1;
		int smallOne = 2;
		if (radius1 < radius2) {
			double temp = radius1;
			radius1 = radius2;
			radius2 = temp;
			bigOne = 2;
			smallOne = 1;
		}
		if (distanceBetweenCenters <= Math.abs(radius1- radius2)) {
			System.out.println("Circle" + bigOne + " is inside " + "circle" + smallOne);
		} else if (distanceBetweenCenters <= radius1 + radius2) {
			System.out.println("Circle2 overlaps circle1");
		} else {
			System.out.println("They don't overlap each other");
		}
	}

}

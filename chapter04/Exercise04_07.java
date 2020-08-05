package chapter04;

import java.util.Scanner;

public class Exercise04_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		double x1 = radius * Math.cos(Math.toRadians(18));
		double y1 = radius * Math.sin(Math.toRadians(18));
		double x2 = radius * Math.cos(Math.toRadians(90));
		double y2 = radius * Math.sin(Math.toRadians(90));
		double x3 = radius * Math.cos(Math.toRadians(162));
		double y3 = radius * Math.sin(Math.toRadians(162));
		double x4 = radius * Math.cos(Math.toRadians(234));
		double y4 = radius * Math.sin(Math.toRadians(234));
		double x5 = radius * Math.cos(Math.toRadians(306));
		double y5 = radius * Math.sin(Math.toRadians(306));

		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		System.out.println("(" + x4 + ", " + y4 + ")");
		System.out.println("(" + x5 + ", " + y5 + ")");
	}

}

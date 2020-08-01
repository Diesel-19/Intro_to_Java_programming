package chapter03;

import java.util.Scanner;

public class Exercise03_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		if (x1 > 5 || x1 < -5 || y1 > 2.5 || y1 < -2.5) {
			System.out.println("The point is not in the rectangle.");
		} else {
			System.out.println("The point is in the rectangle.");
		}
	}

}

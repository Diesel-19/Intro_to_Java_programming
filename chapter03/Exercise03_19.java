package chapter03;

import java.util.Scanner;

public class Exercise03_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 edges for a triangle: ");
		double e1 = input.nextDouble();
		double e2 = input.nextDouble();
		double e3 = input.nextDouble();

		if ((e1 + e2 > e3 && e2 + e3 > e1 && e1 + e3 > e2) && (e1 > 0 && e2 > 0 && e3 > 0)) {
			System.out.println(e1 + e2 + e3);
		} else {
			System.out.println("The input is invalid");
		}
	}
}

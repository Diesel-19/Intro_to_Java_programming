package chapter04;

import java.util.Scanner;

public class Exercise04_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %.2f", area );
	}

}

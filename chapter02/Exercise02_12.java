package chapter02;

import java.util.Scanner;

public class Exercise02_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("The min runway length is: " + (int)(length * 1000) / 1000.);
	}
}
package chapter02;

import java.util.Scanner;

public class Exercise02_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temp = input.nextDouble();

		System.out.print("Enter the wind spped (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();

		double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16))
				+ (0.4275 * temp * Math.pow(windSpeed, 0.16));
		System.out.println("The wind chill index is " + windChill);
	}

}

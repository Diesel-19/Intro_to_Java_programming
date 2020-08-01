package chapter03;

import java.util.Scanner;

public class Exercise03_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature (between -58F and 41F) and the wind speed (>=2): ");
		double temp = input.nextDouble();
		double windSpeed = input.nextDouble();

		double windChill;

		if (temp > 41 || temp < -58 || windSpeed < 2) {
			System.out.println("The input is invalid");
		} else {
			windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16))
					+ (0.4275 * temp * Math.pow(windSpeed, 0.16));
			System.out.println("The wind chill index is " + windChill);
		}
	}
}
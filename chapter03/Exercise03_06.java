package chapter03;

import java.util.Scanner;

public class Exercise03_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter feet: ");
		int feet = input.nextInt();
		
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();
		
		double height = 12 * feet + inches;
		double kilograms = pounds * 0.45359237;
		double meters = height * 0.0254;
		
		double BMI = kilograms / Math.pow(meters, 2);
		
		System.out.println("BMI is " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("Underweight");
		} else if (BMI < 25) {
			System.out.println("Normal");
		} else if (BMI < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}

}

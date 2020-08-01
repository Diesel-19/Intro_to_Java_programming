package chapter03;

import java.util.Scanner;

public class Chapter03_ComputingBodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		double kilograms = weight * 0.45359237;
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

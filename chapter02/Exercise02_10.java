package chapter02;

import java.util.Scanner;

public class Exercise02_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterAmount = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		double energy = 55.5 * (finalTemp - initialTemp) * 4184;
		System.out.println("The energy needed is: " + energy);
	}
}

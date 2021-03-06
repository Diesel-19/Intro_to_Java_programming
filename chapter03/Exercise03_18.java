package chapter03;

import java.util.Scanner;

public class Exercise03_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package: ");
		double weight = input.nextDouble();

		double cost = 0;
		
		if (weight > 50) {
			System.out.println("This package can't be shipped");
		} else if (weight < 0) {
			System.out.println("Weight can't be lower than 0");
		} else if (weight <= 1) {
			cost = 3.5;
		} else if (weight <= 3) {
			cost = 5.5;
		} else if (weight <= 10) {
			cost = 8.5;
		} else if (weight <= 20) {
			cost = 10.5;
		}
		System.out.println("The cost is: " + cost);
	}
}

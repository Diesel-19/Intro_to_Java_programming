package chapter05;

import java.util.Scanner;

public class Exercise05_45 {
	public static void main(String[] args) {
		int amount = 10;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ten numbers: ");

		double sum = 0;
		double sum1 = 0;

		for (int i = 0; i < amount; i++) {
			double x = input.nextDouble();
			sum += x;
			sum1 += Math.pow(x, 2);
		}
		System.out.println("The mean is: " + (sum / amount));

		double deviation = Math.sqrt((sum1 - sum * sum / amount) / (amount - 1));
		System.out.printf("Standart deviation is: %.5f", deviation);
	}
}

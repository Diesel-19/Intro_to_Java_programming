package chapter07;

import java.util.Scanner;

public class Exercise07_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter " + size + " numbers");
		double[] numbers = new double[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = input.nextDouble();
		}
		double deviation = deviation(numbers);
		double mean = mean(numbers);
		System.out.printf("The mean is: %.2f\n", mean);
		System.out.printf("The deviation is: %.5f", deviation);
	}

	public static double mean(double[] numbers) {
		double sum = 0;
		for (double d : numbers) {
			sum += d;
		}
		double mean = sum / numbers.length;
		return mean;
	}

	public static double deviation(double[] numbers) {
		double deviationSum = 0;
		double mean = mean(numbers);
		for (double d : numbers) {
			deviationSum += Math.pow((d - mean), 2);
		}
		double deviation = Math.sqrt(deviationSum / (numbers.length - 1));
		return deviation;
	}
}

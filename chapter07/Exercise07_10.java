package chapter07;

import java.util.Scanner;

public class Exercise07_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter 10 numbers: ");
		double[] numbers = new double[size];

		for (int i = 0; i < size; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println(minIndex(numbers));

	}

	public static int minIndex(double[] numbers) {
		double min = numbers[0];
		int minIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < min) {
					min = numbers[j];
					minIndex = j;
				}
			}
		}
		return minIndex;
	}
}

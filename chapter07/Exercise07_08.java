package chapter07;

import java.util.Scanner;

public class Exercise07_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter " + size + " values: ");
		double[] array = new double[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextDouble();
		}
		double average = average(array);
		System.out.println(average);
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum / array.length;
		return average;
	}
}

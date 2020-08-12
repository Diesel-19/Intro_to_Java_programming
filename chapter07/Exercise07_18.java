package chapter07;

import java.util.Scanner;

public class Exercise07_18 {
	public static void main(String[] args) {
		int size = 10;
		Scanner input = new Scanner(System.in);
		double[] array = new double[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextDouble();
		}
		bubbleSort(array);
		for (double d : array) {
			System.out.print(d + " ");
		}
	}

	public static void bubbleSort(double[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					double temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}
}

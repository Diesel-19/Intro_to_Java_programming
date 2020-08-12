package chapter07;

import java.util.Scanner;

public class Exercise07_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter " + size + " double values: ");
		double[] number = new double[size];
		for (int i = 0; i < size; i++) {
			number[i] = input.nextDouble();
		}
		sort(number);
		for (double d : number) {
			System.out.print(d + " ");
		}
	}

	public static void sort(double[] number) {
		for (int i = 0; i < number.length - 1; i++) {
			double max = number[i];
			int maxIndex = i;
			for (int j = i + 1; j < number.length; j++) {
				if (number[j] > max) {
					max = number[j];
					maxIndex = j;
				}
			}
			if (maxIndex != i) {
				number[maxIndex] = number[i];
				number[i] = max;
			}
		}
	}
}

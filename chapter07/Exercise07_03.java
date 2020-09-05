package chapter07;

import java.util.Scanner;

public class Exercise07_03 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter integers between 1 and 100: ");

		while (true) {
			int a = input.nextInt();
			if (a == 0) {
				break;
			}
			for (int i = 0; i < numbers.length; i++) {
				if (a == i + 1) {
					numbers[i]++;
					break;
				}
			}

		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) {
				if (numbers[i] == 1) {
					System.out.println((i + 1) + " occurs " + numbers[i] + " time");
				} else {
					System.out.println((i + 1) + " occurs " + numbers[i] + " times");
				}
			}
		}
	}
}

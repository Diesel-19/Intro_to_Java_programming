package chapter07;

import java.util.Scanner;

public class Exercise07_14 {
	public static void main(String[] args) {
		int size = 5;
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(gcd(numbers));
	}

	public static int gcd(int[] numbers) {
		int gcd = 1;
		for (int i = 2; i <= min(numbers); i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i != 0) {
					break;
				}
				gcd = i;
			}

		}
		return gcd;
	}

	public static int min(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i + 1] < numbers[i]) {
				min = numbers[i + 1];
			}
		}
		return min;
	}
}

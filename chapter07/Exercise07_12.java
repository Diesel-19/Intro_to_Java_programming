package chapter07;

import java.util.Scanner;

public class Exercise07_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 10;
		System.out.println("Enter " + size + " numbers: ");
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = input.nextInt();
		}
		int count = 0;
		for (int i : reverse(numbers)) {
			System.out.print(i + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static int[] reverse(int[] numbers) {
		int[] reverse = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			reverse[numbers.length - 1 - i] = numbers[i];
		}

		return reverse;
	}
}

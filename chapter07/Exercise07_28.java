package chapter07;

import java.util.Scanner;

public class Exercise07_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 10 integers");
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
			}
		}
	}
}

package chapter12.Exercise03;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter index");
		int index = input.nextInt();
		try {
			System.out.println(numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Out of Bounds");
		}
	}
}

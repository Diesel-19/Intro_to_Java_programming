package chapter07;

import java.util.Scanner;

public class Exercise07_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list1 (first integer is the length): ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println("Enter list2 (first integer is the length): ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			list2[i] = input.nextInt();
		}
		int[] merged = merge(list1, list2);
		for (int i : merged) {
			System.out.print(i + " ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] merge;

		return merge;
	}
}

package chapter07;

import java.util.Scanner;

public class Exercise07_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter list 1: ");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println("Enter list 2: ");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			list2[i] = input.nextInt();
		}
		if (equals(list1, list2)) {
			System.out.println("Strictly identical");
		} else {
			System.out.println("Not strictly identical");
		}
	}

	private static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}
		if (list1 == null || list2 == null) {
			return false;
		}
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;
	}
}

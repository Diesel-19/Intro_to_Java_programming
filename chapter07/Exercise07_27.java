package chapter07;

import java.util.Scanner;

public class Exercise07_27 {
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
		sort(list1, list2);
		equals(list1, list2);
	}

	private static void sort(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length - 1; i++) {
			int min = list1[i];
			int minIndex = i;
			for (int j = i + 1; j < list1.length; j++) {
				if (list1[j] < min) {
					min = list1[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				list1[minIndex] = list1[i];
				list1[i] = min;
			}
		}
		for (int i = 0; i < list2.length - 1; i++) {
			int min = list2[i];
			int minIndex = i;
			for (int j = i + 1; j < list2.length; j++) {
				if (list2[j] < min) {
					min = list2[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				list2[minIndex] = list2[i];
				list2[i] = min;
			}
		}
	}

	public static boolean equals(int[] list1, int[] list2) {
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

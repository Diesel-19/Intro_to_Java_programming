package chapter07;

import java.util.Scanner;

public class Exercise07_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list: ");
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i = 0; i < size; i++) {
			list[i] = input.nextInt();
		}
		System.out.println(isSorted(list));
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}
}

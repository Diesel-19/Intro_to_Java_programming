package chapter08;

import java.util.Scanner;

public class Exercise08_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 3;
		int[][] list1 = new int[size][size];
		int[][] list2 = new int[size][size];
		System.out.println("Enter list 1");
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[0].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter list 2");
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[0].length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		if (equals(list1,list2)) {
			System.out.println("The two arrays are strictly identical");
		} else {
			System.out.println("The two arrays are not strictly identical");
		}
	}

	public static boolean equals(int[][] list1, int[][] list2) {
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i][j] != list2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}

package chapter08;

import java.util.Scanner;

public class Exercise08_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] list1 = new int[3][3];
		int[][] list2 = new int[3][3];
		System.out.println("Enter list 1");
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter list 2");
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		if (equals(list1, list2)) {
			System.out.println("The two arrays are identical");
		} else {
			System.out.println("The two arrays are not identical");
		}
	}

	public static boolean equals(int[][] list1, int[][] list2) {
		//TODO fill method
		return false;
	}

}

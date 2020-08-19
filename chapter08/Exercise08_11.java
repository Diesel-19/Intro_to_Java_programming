package chapter08;

import java.util.Scanner;

public class Exercise08_11 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511");
		int number = input.nextInt();

		String str = "";
		for (int i = 0; i < 9; i++) {
			str = (number & 1) + str;
			number >>= 1;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (str.charAt(i * 3 + j) == '0') {
					System.out.print("H ");
				} else {
					System.out.print("T ");
				}
			}
			System.out.println();
		}
	}
}

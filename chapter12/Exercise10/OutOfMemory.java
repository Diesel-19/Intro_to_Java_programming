package chapter12.Exercise10;

import java.util.Scanner;

public class OutOfMemory {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = input.nextInt();
		
		try {
			int[][] array = new int[size][size];
		} catch (OutOfMemoryError e) {
			System.out.println("Entered size is too big");
		}
	}
}

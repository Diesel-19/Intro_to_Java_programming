package chapter07;

import java.util.Scanner;

public class Exercise07_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of balls to drop: ");
		int ballCount = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int slotCount = input.nextInt();
		int[] slot = randomPath(slotCount, ballCount);

		System.out.println();
		printPositions(slot);
		for (int i = 0; i < slot.length; i++) {
			System.out.print("-");
		}
	}

	public static void printPositions(int[] slot) {
		int max = getMax(slot);
		for (int j = max; j > 0; j--) {
			for (int i = 0; i < slot.length; i++) {
				if (slot[i] < j) {
					System.out.print(" ");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static int getMax(int[] slot) {
		int max = slot[0];
		for (int i = 0; i < slot.length; i++) {
			if (max < slot[i]) {
				max = slot[i];
			}
		}
		return max;
	}

	public static int[] randomPath(int slotCount, int ballCount) {
		int[] slot = new int[slotCount];
		int sum = 0;
		for (int i = 0; i < ballCount; i++) {
			sum = 0;
			for (int j = 0; j < slotCount; j++) {
				int random = (int) (Math.random() * 2);
				sum += random;
				if (random == 0) {
					System.out.print("L");
				} else {
					System.out.print("R");
				}
				if (j == slotCount - 1) {
					slot[sum]++;
				}
			}
			System.out.println();
		}
		return slot;
	}
}

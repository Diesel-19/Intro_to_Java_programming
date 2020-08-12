package chapter07;

import java.util.Scanner;

public class Exercise07_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list: ");
		int size = input.nextInt();

		int[] list = new int[size];
		for (int i = 0; i < size; i++) {
			list[i] = input.nextInt();
		}
		int[] partitioned = partition(list);
		for (int i : partitioned) {
			System.out.print(i + " ");
		}
	}

	public static int[] partition(int[] list) {
		int[] partition = new int[list.length];
		int pivot = list[0];
		int minIndex = 0;
		int maxIndex = list.length - 1;
		for (int i = 1; i < list.length; i++) {
			if (list[i] < pivot) {
				partition[minIndex] = list[i];
				minIndex++;
			}
			if (pivot < list[i]) {
				partition[maxIndex] = list[i];
				maxIndex--;
			}
		}
		partition[minIndex] = pivot;

		return partition;
	}
}

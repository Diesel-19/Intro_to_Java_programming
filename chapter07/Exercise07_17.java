package chapter07;

import java.util.Scanner;

public class Exercise07_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int size = input.nextInt();
		System.out.println("Enter student's point and name: ");
		String[] name = new String[size];
		int[] point = new int[size];
		for (int i = 0; i < size; i++) {
			point[i] = input.nextInt();
			input.nextLine();
			name[i] = input.nextLine();
		}
		sort(name, point);
		for (int i = 0; i < size; i++) {
			System.out.println(name[i]);
		}
	}

	public static void sort(String[] name, int[] point) {
		for (int i = 0; i < point.length - 1; i++) {
			int max = point[i];
			int maxIndex = i;
			String maxName = name[i];
			for (int j = i + 1; j < point.length; j++) {
				if (point[j] > max) {
					max = point[j];
					maxIndex = j;
					maxName = name[j];
				}
			}
			if (maxIndex != i) {
				point[maxIndex] = point[i];
				point[i] = max;
				name[maxIndex] = name[i];
				name[i] = maxName;
			}
		}
	}
}

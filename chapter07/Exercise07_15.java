package chapter07;

import java.util.Scanner;

public class Exercise07_15 {
	public static void main(String[] args) {
		int size = 10;
		Scanner input = new Scanner(System.in);
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = input.nextInt();
		}
		int[] withoutDups = eliminateDuplicates(num);
		for (int e : withoutDups) {
			System.out.print(e + " ");
		}
	}

	public static int[] eliminateDuplicates(int[] num) {
		int[] distinctList = new int[num.length];
		int i = 0;
		for (int e : num) {
			if (linearSearch(distinctList, e) == -1) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
	}

	public static int linearSearch(int[] num, int e) {
		for (int i = 0; i < num.length; i++) {
			if (e == num[i])
				return i;
		}
		return -1;
	}
}

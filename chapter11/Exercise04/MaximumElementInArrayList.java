package chapter11.Exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElementInArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int number = input.nextInt();
			if (number == 0) {
				break;
			}
			list.add(number);
		}
		if (list.equals(null) || list.size() == 0) {
			System.err.print("The list is empty");
			System.exit(0);
		}
		System.out.println(max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		return java.util.Collections.max(list);
	}

	public static Integer max1(ArrayList<Integer> list) {
		if (list.equals(null) || list.size() == 0) {
			return null;
		}
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
}

package chapter11.Exercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}
}

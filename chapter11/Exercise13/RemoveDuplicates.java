package chapter11.Exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);
		System.out.println(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				while (list.get(i) == list.get(j)) {
					list.remove(j);
				}
			}
		}
	}
}

package chapter11.Exercise07;

import java.util.ArrayList;
import java.util.Scanner;

public class ShuffleArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		shuffle(list);
		System.out.println(list);
	}

	public static void shuffle(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int index = (int) (Math.random() * list.size());
			int temp = list.get(i);
			list.set(i, list.get(index));
			list.set(index, temp);
		}
	}
}

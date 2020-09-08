package chapter13.Exercise02;

import java.util.ArrayList;

public class ShuffleArrayList {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(2.2);
		list.add(3.2);
		list.add(4.2);
		list.add(5.2);
		list.add(6.3);
		list.add(7.4);
		shuffle(list);
		for (Number number : list) {
			System.out.println(number);
		}
	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			int index = (int) (Math.random() * list.size());
			Number temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
	}
}

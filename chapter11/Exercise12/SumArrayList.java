package chapter11.Exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}

		System.out.println(sum(list));
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}

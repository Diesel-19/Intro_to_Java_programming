package chapter11.Exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Enter five integers for list1:");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		System.out.println("Enter five integers for list2:");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		ArrayList<Integer> combined = union(list1, list2);
		System.out.println(combined);
	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> combined = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			combined.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			combined.add(list2.get(i));
		}
		return combined;
	}
}

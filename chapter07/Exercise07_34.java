package chapter07;

import java.util.Scanner;

public class Exercise07_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String sorted = sort(str);
		System.out.println(sorted);
	}

	public static String sort(String str) {
		String sorted = "";
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		for (int i = 0; i < ch.length - 1; i++) {
			char min = ch[i];
			int minIndex = i;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < min) {
					min = ch[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				ch[minIndex] = ch[i];
				ch[i] = min;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			sorted += ch[i];
		}
		return sorted;
	}

}

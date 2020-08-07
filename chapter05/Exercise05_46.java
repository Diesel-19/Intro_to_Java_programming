package chapter05;

import java.util.Scanner;

public class Exercise05_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length()-1-i);
			str2 += "" + ch;
		}
		System.out.println(str2);
	}
}

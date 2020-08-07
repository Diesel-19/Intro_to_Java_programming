package chapter05;

import java.util.Scanner;

public class Exercise05_48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String random = "";
		for (int i = (int)(Math.random()*str.length()); i < str.length(); i++) {
			char ch = str.charAt((int) (Math.random() * str.length()));
			 random += ch;
		}
		System.out.println(random);
	}
}

package chapter04;

import java.util.Scanner;

public class Exercise04_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter ");
		String str = input.next();
		char ch = str.toLowerCase().charAt(0);

		if (str.length() != 1 || Character.isLetter(ch) == false) {
			System.err.println("Wrong input");
			System.exit(0);
		}
		String start = "The corresponding number is ";
		
		if ('a' <= ch && ch <= 'c') {
			System.out.println(start + "2");
		} else if ('d' <= ch && ch <='f') {
			System.out.println(start + "3");
		} else if ('g' <= ch && ch <='i') {
			System.out.println(start + "4");
		} else if ('j' <= ch && ch <='l') {
			System.out.println(start + "5");
		} else if ('m' <= ch && ch <='o') {
			System.out.println(start + "6");
		} else if ('p' <= ch && ch <='s') {
			System.out.println(start + "7");
		} else if ('t' <= ch && ch <='v') {
			System.out.println(start + "8");
		} else if ('w' <= ch && ch <='z') {
			System.out.println(start + "9");
		} else {
			System.err.println("Wrong input");
			System.exit(0);
		}

	}

}
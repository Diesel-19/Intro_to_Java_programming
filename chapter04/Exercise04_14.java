package chapter04;

import java.util.Scanner;

public class Exercise04_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		String str = input.next();
		char ch = str.toUpperCase().charAt(0);
		
		if ('A' <= ch && ch <= 'F' && ch != 'E') {
			switch (ch) {
			case 'A': System.out.println("4"); break;
			case 'B': System.out.println("3"); break;
			case 'C': System.out.println("2"); break;
			case 'D': System.out.println("1"); break;
			case 'F': System.out.println("0"); break;
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}

package chapter04;

import java.util.Scanner;

public class Exercise04_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		String str = input.nextLine();
		
		char ch = str.charAt(0);
		int code = (int) ch;
		
		System.out.println("The unicode for the character " + ch + " is " + code);
	}

}

package chapter04;

import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String str = input.next();
		char ch = str.charAt(0);
		
		if (str.length()!=1) {
			System.err.println("Wrong input");
			System.exit(0);
		}
		
		String vowel = "AEIOUaeiou";
		if (vowel.contains(str)) {
			System.out.println("vowel");
		} else if (Character.isLetter(ch)) {
			System.out.println("consonant");
		} else {
			System.err.println("Wrong input");
			System.exit(0);
		}
	}

}

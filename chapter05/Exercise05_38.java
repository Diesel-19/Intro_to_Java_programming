package chapter05;

import java.util.Scanner;

public class Exercise05_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal integer: ");
		int decimal = input.nextInt();

		String octal = "";
		while (decimal != 0) {
			octal = (decimal % 8) + octal;
			decimal = decimal / 8;
		}
		System.out.println(octal);
	
		
	}
}

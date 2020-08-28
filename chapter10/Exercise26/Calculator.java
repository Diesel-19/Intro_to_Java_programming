package chapter10.Exercise26;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a calculation");
		String a = input.nextLine();

		String operation = a.replaceAll(" ", "");
		System.out.println(calculation(operation));
	}

	public static double calculation(String operation) {
		switch (operation.charAt(1)) {
		case '+':
		case '-':
		case '*':
		case '/':
		default:
			return 0;
		}

	}
}

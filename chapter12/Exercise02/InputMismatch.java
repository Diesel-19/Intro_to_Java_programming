package chapter12.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {

		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter two integers");
				int a = input.nextInt();
				int b = input.nextInt();
				System.out.println("sum is: " + (a + b));
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
			}
		}
	}
}

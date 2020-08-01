package chapter03;

import java.util.Scanner;

public class Exercise03_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 3 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a <= b) {
			if (b <= c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a <= c){
				System.out.println(a + " " + c + " " + b);
			} else {
				System.out.println(c + " " + a + " " + b);
			}
		} else if (a <= c) {
			System.out.println(c + " " + a + " " + b);
		} else if (c <= b) {
			System.out.println(a + " " + b + " " + c);
		} else {
			System.out.println(a + " " + c + " " + b);
		}
	}
}
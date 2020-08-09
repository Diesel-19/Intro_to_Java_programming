package chapter06;

import java.util.Scanner;

public class Exercise06_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = input.nextInt();

		System.out.println("The sum of the digits is: " + sumDigits(number));
	}

	public static int sumDigits(long n) {
		int sum = 0;
		int remaining = (int) n;
		int i = 1;
		while (remaining > 0) {
			sum += remaining % 10;
			remaining /= 10;
			i++;
		}
		return sum;
	}
}

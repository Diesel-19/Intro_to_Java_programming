package chapter06;

import java.util.Scanner;

public class Exercise06_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println("The approximate square root is: " + sqrt(n));
	}

	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = 0;
		while (Math.abs(nextGuess - lastGuess) > 0.0001) {
			double temp = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
			lastGuess = temp;
		}
		return nextGuess;
	}
}

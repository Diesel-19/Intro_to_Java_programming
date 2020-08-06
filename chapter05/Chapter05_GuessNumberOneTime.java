package chapter05;

import java.util.Scanner;

public class Chapter05_GuessNumberOneTime {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a number between 0 and 100");
		int guess = -1;

		while (guess != number) {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();

			if (number == guess) {
				System.out.println("Correct guess");
			} else if (guess < number) {
				System.out.println("Your guess is too low");
			} else {
				System.out.println("Your guess is too high");
			}
		}
	}

}

package chapter03;

import java.util.Scanner;

public class Exercise03_15 {
	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 900) + 100;

		Scanner input = new Scanner(System.in);
		System.out.print("Guess a three digit number ");
		int guess = input.nextInt();

		int guessDigit1 = guess / 100;
		int remaining = guess % 100;

		int guessDigit2 = remaining / 10;
		remaining %= 10;

		int guessDigit3 = remaining;

		int lotteryDigit1 = lottery / 100;
		remaining = lottery % 100;

		int lotteryDigit2 = remaining / 10;
		remaining %= 10;

		int lotteryDigit3 = remaining;

		if (guess == lottery) {
			System.out.println("You won €10.000");
		} else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
				|| (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
				|| (guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)) {
			System.out.println("You won €3.000");
		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
			System.out.println("You won €1.000");
		} else {
			System.out.println("You won nothing");
		}
		System.out.println("The lottery number was " + lottery);
	}
}

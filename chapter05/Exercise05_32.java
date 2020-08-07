package chapter05;

import java.util.Scanner;

public class Exercise05_32 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Guess a two digit number ");
		int guess = input.nextInt();

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		int lotteryDigit1 = (int) (Math.random() * 9 + 1);
		int lotteryDigit2;
		do {
			lotteryDigit2 = (int) (Math.random() * 10);
		} while (lotteryDigit1 == lotteryDigit2);
		
		int lottery = lotteryDigit1 * 10 + lotteryDigit2;

		if (guess == lottery) {
			System.out.println("You won €10.000");
		} else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
			System.out.println("You won €3.000");
		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2) {
			System.out.println("You won €1.000");
		} else {
			System.out.println("You won nothing");
		}
		System.out.println("The lottery number was " + lottery);
	}

}

package chapter04;

import java.util.Scanner;

public class Chapter04_Lottery {
	public static void main(String[] args) {
		String lottery = "" + (int) (Math.random() * 9 + 1) + (int) (Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a two digit number ");
		String guess = input.nextLine();
		
		char guessDigit1 = guess.charAt(0);
		char guessDigit2 = guess.charAt(1);
		
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		
		
		if (guess.equals(lottery)) {
			System.out.println("You won €10.000");
		} else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
			System.out.println("You won €3.000");
		} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 ==lotteryDigit1 || guessDigit2 == lotteryDigit2) {
			System.out.println("You won €1.000");
		} else {
			System.out.println("You won nothing");
		}
		System.out.println("The lottery number was " + lottery);
	}

}

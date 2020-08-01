package chapter03;

import java.util.Scanner;

public class Chapter03_Lottery {
	public static void main(String[] args) {
		int lottery = (int) (Math.random() * 90) + 10;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a two digit number ");
		int guess = input.nextInt();
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		
		if (guess == lottery) {
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

package chapter05;

import java.util.Scanner;

public class Chapter05_RepeatAdditionQuiz {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int cAnswer = number1 + number2;
		Scanner input = new Scanner(System.in);
		System.out.println(number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();

		int count = 0;
		while (answer != cAnswer && count < 3) {
			System.out.println("Wrong");
			System.out.println(number1 + " + " + number2 + " = ?");
			answer = input.nextInt();
			count++;
		}
		if (count < 3) {
			System.out.println("Correct");
		} else {
			System.out.println("Too many wrong tries");
		}
	}

}

package chapter11.Exercise16;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answers = new ArrayList<>();

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int cAnswer = number1 + number2;

		System.out.println(number1 + " + " + number2 + " = ?");
		int answer = input.nextInt();

		answers.add(answer);
		int count = 0;
		while (answer != cAnswer && count < 3) {
			System.out.println("Wrong");
			System.out.println(number1 + " + " + number2 + " = ?");
			answer = input.nextInt();
			if (answers.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			answers.add(answer);
			count++;
		}
		if (count < 3) {
			System.out.println("Correct");
		} else {
			System.out.println("Too many wrong tries");
		}
	}

}

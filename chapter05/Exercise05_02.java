package chapter05;

import java.util.Scanner;

public class Exercise05_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int correctAnswers = 0;
		long startTime = System.currentTimeMillis();
		int count = 0;
		String output = "";
		while (count < 10) {
			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			System.out.println(number1 + " - " + number2 + " = ?");
			int answer = input.nextInt();
			if (answer == (number1 - number2)) {
				System.out.println("Correct");
				correctAnswers++;
			} else {
				System.out.println("Wrong. The answer is: " + (number1 - number2));
			}
			count++;
			output += "\n" + number1 + "-" + number2 + "=" + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime) / 1000;
		System.out.println("Correct answers: " + correctAnswers + "\nTest time: " + time + " seconds" + output);
	}
}

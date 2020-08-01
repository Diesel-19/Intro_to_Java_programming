package chapter03;

import java.util.Scanner;

public class Chapter03_AdditionQuiz {
	public static void main(String[] args) {
		int number1 = (int) (System.currentTimeMillis() % 10); //Math.random
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);

		Scanner input = new Scanner(System.in);
		System.out.println(number1 + " + " + number2 + " = ");
		int answer = input.nextInt();

		System.out.println(answer == number1 + number2);
	}
}

package chapter03;

import java.util.Scanner;

public class Chapter03_GeneratingRandomNumbers {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		if (number1 < number2) {
			int hold = number1;
			number1 = number2;
			number2 = hold;
		}

		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 + " - " + number2 + " ? ");
		int answer = input.nextInt();
		
		if (answer == number1 - number2) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong, the answer should be " + (number1 - number2));
		}
	}

}

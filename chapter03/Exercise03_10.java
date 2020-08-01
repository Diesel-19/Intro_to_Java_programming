package chapter03;

import java.util.Scanner;

public class Exercise03_10 {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();
		
		if (answer == number1 + number2) {
			System.out.println("Correct");
		} else {
			System.out.println("Wrong, the answer should be " + (number1 + number2));
		}
	}
}

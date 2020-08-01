package chapter03;

import java.util.Scanner;

public class Exercise03_02 {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10); //Math.random
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);
		System.out.print(number1 + " + " + number2 + " + " + number3 + " = ");
		int answer = input.nextInt();

		System.out.println(answer == number1 + number2 + number3);
	}
}

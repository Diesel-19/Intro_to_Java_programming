package chapter05;

import java.util.Scanner;

public class Exercise05_41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter numbers(ends with 0): ");
		int max = 0;
		int count = 1;
		int number = 1;
		do {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max){
				count++;
			}

		} while (number != 0);
		System.out.println("Max is: " + max + "\n" + count + " times");
	}
}

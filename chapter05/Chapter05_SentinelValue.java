package chapter05;

import java.util.Scanner;

public class Chapter05_SentinelValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int data = 1;
		int sum = 0;
		while (data != 0) {
			sum += data;
			System.out.println("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		}
		System.out.println("The sum is: " + (sum - 1));
	}
}
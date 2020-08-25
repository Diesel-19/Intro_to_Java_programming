package chapter10.Exercise05;

import java.util.Scanner;

public class DisplayPrimeFactors {
	public static void main(String[] args) {
		StackOfIntegers o1 = new StackOfIntegers();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();

		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				while (number % i == 0) {
					o1.push(i);
					number /= i;
				}
			}
		}
		while (!o1.empty()) {
			System.out.println(o1.pop());
		}
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
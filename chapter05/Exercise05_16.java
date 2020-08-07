package chapter05;

import java.util.Scanner;

public class Exercise05_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int n1 = input.nextInt();

		int prime = 1;
		String str = "";
		boolean isPrime = true;

		while (prime < n1) {
			int divisor = 2;

			prime++;
			while (prime % divisor != 0) {
				divisor++;
			}
			if (divisor == prime) {
				isPrime = true;
			} else {
				isPrime = false;
				continue;
			}
			while (n1 % prime == 0) {
				str += prime + ", ";
				n1 /= prime;
			}
		}
		str = str.substring(0, str.length() - 2);
		System.out.println(str);
	}
}
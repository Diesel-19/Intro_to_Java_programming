package chapter05;

import java.util.Scanner;

public class Chapter05_GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		/*
		 * if (n1 < n2) { int temp = n1; n1 = n2; n2 = temp; } int max = 1; for (int i =
		 * 1; i < n1 + 1; i++) { if (n1 % i == 0 && n2 % i == 0) { max = i; } }
		 */
		int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		}

		System.out.println(gcd);
	}

}

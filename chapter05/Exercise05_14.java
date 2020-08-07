package chapter05;

import java.util.Scanner;

public class Exercise05_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		if (n2 < n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		int d = n1;
		while (n1 % d != 0 || n2 % d != 0) {
			d--;
		}
		System.out.println("The greatest common divisor is: " + d);
	}

}

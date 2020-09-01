package chapter11.Exercise17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer m:");
		int m = input.nextInt();
		System.out.println("The smallest number n for m * n to be a perfect square is: " + findN(m) + " \nm * n is "
				+ (findN(m) * m));
	}

	public static int findN(int m) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for (int i = 2; i <= m; i++) {
			while (m % i == 0) {
				list1.add(i);
				m = m / i;
			}
		}
		int n = 1;
		while (true) {
			int count = 0;
			int number = list1.get(0);
			while (list1.contains(number)) {
				list1.remove(0);
				count++;
			}
			if (count % 2 != 0) {
				n = n * number;
			}
			if (list1.isEmpty()) {
				break;
			}
		}

		return n;
	}
}

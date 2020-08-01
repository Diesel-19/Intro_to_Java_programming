package chapter03;

public class Chapter03_Learning01 {
	public static void main(String[] args) {
		System.out.println(Math.abs(4 - 5));

		int number = 0;
		boolean even = number % 2 == 0;
		/*
		 * shorter than:
		 * 
		 * if (number % 2 == 0) even = true; else even = false;
		 */

		// ---------------------------------------------------------
		int i = 0, j = 0, k = 0, x = 0, y = 0, z = 0;

		if (i > 0)
			if (j > 0)
				x = 0;
			else if (k > 0)
				y = 0;
			else
				z = 0;
	}
}
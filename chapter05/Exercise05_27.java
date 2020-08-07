package chapter05;

public class Exercise05_27 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i < 2101; i++) {
			if ((i % 4 == 0 && i % 4 != 100) || (i % 400 == 0)) {
				System.out.printf("%-5d", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println("Number of leap years: " + count);
	}
}

package chapter06;

public class Exercise06_01 {
	public static void main(String[] args) {
		final int NUMBER_ON_EACH_LINE = 10;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.printf("%-6d ", getPentagonalNumber(i));
			count++;
			if (count % NUMBER_ON_EACH_LINE == 0) {
				System.out.println();
			}
		}

	}

	public static int getPentagonalNumber(int n) {
		int k = n * (3 * n - 1) / 2;
		return k;
	}
}

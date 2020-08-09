package chapter06;

public class Exercise06_13 {
	public static void main(String[] args) {
		System.out.println("i \tm(i)");
		System.out.println("-------------");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-2d\t%.4f", i, sumSeries(i));
			System.out.println();
		}
	}

	private static double sumSeries(int i) {
		double sum = 0;
		for (int k = 1; k <= i; k++) {
			sum += (double) k / (k + 1);
		}
		return sum;
	}
}

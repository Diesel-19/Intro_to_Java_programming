package chapter05;

public class Exercise05_26 {
	public static void main(String[] args) {

		for (double value = 10000; value <= 100000; value += 10000) {
			double e = 0.0;
			for (double i = 1; i <= value; i++) {
				double denominator = i;
				for (double k = i - 1; k >= 1; k--) {
					denominator *= k;
				}
				e += 1 / denominator;
			}
			System.out.println("i: " + (int) value + " " + e);
		}
	}
}

package chapter05;

public class Exercise05_25 {
	public static void main(String[] args) {
		for (int k = 10000; k < 100001; k += 10000) {
			double pi = 0;
			for (int i = 1; i <= k; i++) {
				pi += Math.pow(-1, i + 1) / (2 * i - 1);
			}
			pi = pi * 4;
			System.out.println("for k = " + k + " pi is: " + pi);
		}
	}

}

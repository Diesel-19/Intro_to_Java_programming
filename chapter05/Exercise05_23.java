package chapter05;

public class Exercise05_23 {
	public static void main(String[] args) {
		double sum1 = 0;
		double sum2 = 0;
		for (int n = 1; n <= 50000; n++) {
			sum1 += (1. / n);
		}
		for (int n = 50000; n >=1; n--) {
			sum2 += (1. / n);
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}

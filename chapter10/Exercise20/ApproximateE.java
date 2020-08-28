package chapter10.Exercise20;

import java.math.BigDecimal;

public class ApproximateE {
	public static void main(String[] args) {

		for (int i = 100; i <= 1000; i += 100) {
			BigDecimal sum = new BigDecimal("1");
			BigDecimal factorial = new BigDecimal("1");

			for (int j = 1; j <= i; j++) {
				for (int j2 = 1; j2 <= j; j2++) {
					factorial = factorial
							.multiply(BigDecimal.ONE.divide(new BigDecimal(j2 + ""), 25, BigDecimal.ROUND_DOWN));
				}
				sum = sum.add(factorial);
			}
			System.out.println(sum);
		}
	}
}

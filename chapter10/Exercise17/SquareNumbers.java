package chapter10.Exercise17;

import java.math.BigInteger;

public class SquareNumbers {
	public static void main(String[] args) {
		BigInteger longMax = new BigInteger(Long.MAX_VALUE + "");
		BigInteger longMaxSqrt = longMax.sqrt();
		int count = 0;
		while (count < 10) {
			longMaxSqrt = longMaxSqrt.add(new BigInteger("1"));
			System.out.println(longMaxSqrt.pow(2));
			count++;
		}

	}
}

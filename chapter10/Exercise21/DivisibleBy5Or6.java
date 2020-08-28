package chapter10.Exercise21;

import java.math.BigInteger;

public class DivisibleBy5Or6 {
	public static void main(String[] args) {
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;
		while (count < 10) {
			number = number.add(new BigInteger("1"));
			if (isDivisible(number)) {
				System.out.println(number);
				count++;
			}
		}
	}

	public static boolean isDivisible(BigInteger number) {
		if (new BigInteger("0").compareTo(number.remainder(new BigInteger("5"))) == 0
				|| new BigInteger("0").compareTo(number.remainder(new BigInteger("6"))) == 0) {
			return true;
		}
		return false;
	}
}

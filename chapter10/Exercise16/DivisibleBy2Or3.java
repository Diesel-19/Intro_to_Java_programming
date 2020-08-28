package chapter10.Exercise16;

import java.math.BigInteger;

public class DivisibleBy2Or3 {
	public static void main(String[] args) {
		int count = 0;
		BigInteger a = new BigInteger(new BigInteger("10").pow(49) + "");
		while (count < 10) {
			if (isDivisibleBy2Or3(a)) {
				System.out.println(a);
				count++;
			}
			a = a.add(new BigInteger("1"));
		}

	}

	public static boolean isDivisibleBy2Or3(BigInteger a) {
		if (new BigInteger("0").compareTo(a.remainder(new BigInteger("2"))) == 0
				|| new BigInteger("0").compareTo(a.remainder(new BigInteger("3"))) == 0) {
			return true;
		}
		return false;
	}
}

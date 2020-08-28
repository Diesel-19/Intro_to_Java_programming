package chapter10.Exercise18;

import java.math.BigInteger;

public class LargePrimeNumbers {
	public static void main(String[] args) {
		int count = 0;
		BigInteger number = new BigInteger(Long.MAX_VALUE + "");
		while (count < 5) {
			number = number.add(new BigInteger("1"));
			if (isPrime(number)) {
				System.out.println(number);
				count++;
			}
		}
	}

	public static boolean isPrime(BigInteger p) {
		if (p.compareTo(new BigInteger("2")) == -1
				|| new BigInteger("0").compareTo(p.remainder(new BigInteger("2"))) == 0) {
			return false;
		}
		for (int i = 2; new BigInteger(i + "").compareTo(p.sqrt()) != 1; i++) {
			if (new BigInteger("0").compareTo(p.remainder(new BigInteger(i + ""))) == 0) {
				return false;
			}
		}
		return true;
	}
}

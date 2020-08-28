package chapter10.Exercise19;

import java.math.BigInteger;

public class MersennePrime {
	public static void main(String[] args) {
		System.out.println("p \t\t2^p-1");
		for (int i = 0; i < 100; i++) {
			BigInteger a = new BigInteger((new BigInteger("2").pow(i)) + "");
			a = a.subtract(new BigInteger("1"));
			if (isPrime2(a)) {
				System.out.printf("%-2d\t\t%d", i, a);
				System.out.println();
			}
		}
	}

	public static boolean isPrime2(BigInteger p) {
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

	public static boolean isPrime(int num) {
		if (num > 2 && num % 2 == 0) {
			return false;
		}
		int top = (int) Math.sqrt(num) + 1;
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
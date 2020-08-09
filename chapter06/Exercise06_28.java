package chapter06;

public class Exercise06_28 {
	public static void main(String[] args) {
		System.out.println("p \t2^p-1");
		System.out.println("-------------");

		for (int i = 2; i <= 31; i++) {
			if (isMersennePrime(i)) {
				System.out.printf("%-2d\t%-2d", i, getMersennePrime(i));
				System.out.println();
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isMersennePrime(int n) {
		if (isPrime(n) && isPrime(getMersennePrime(n))) {
			return true;
		} else {
			return false;
		}
	}

	public static int getMersennePrime(int n) {
		int mP = (int) Math.pow(2, n) - 1;
		return mP;
	}
}

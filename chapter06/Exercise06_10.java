package chapter06;

public class Exercise06_10 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 10000; i > 1; i--) {
			if (isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}

}

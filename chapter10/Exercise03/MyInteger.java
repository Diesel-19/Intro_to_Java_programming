package chapter10.Exercise03;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(int a) {
		return (a % 2 == 0);
	}

	public static boolean isOdd(int a) {
		return (a % 2 != 0);
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger a) {
		return a.isEven();
	}

	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(MyInteger a) {
		return a.value == this.value;
	}

	public static int parseInt(char[] a) {
		int value = 0;
		for (int i = 0, j = (int) Math.pow(10, a.length - 1); i < a.length; i++, j /= 10) {
			value += (a[i] - 48) * j;
		}
		return value;

	}

	public static int parseInt(String a) {
		int value = 0;
		for (int i = 0, j = (int) Math.pow(10, a.length() - 1); i < a.length(); i++, j /= 10) {
			value += (a.charAt(i) - 48) * j;
		}
		return value;
	}

	public int getValue() {
		return value;
	}

}

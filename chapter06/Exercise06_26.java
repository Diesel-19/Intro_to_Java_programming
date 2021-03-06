package chapter06;

public class Exercise06_26 {
	public static void main(String[] args) {
		int count = 0;
		int numberPerLine = 10;
		for (int i = 2; count < 100; i++) {
			if (isPalindromic(i) && isPrime(i)) {
				System.out.print(i + " ");
				count++;
				if (count % numberPerLine == 0) {
					System.out.println();
				}
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

	public static boolean isPalindromic(int n) {
		String str = "" + n;
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse += str.charAt(str.length() - i - 1);
		}
		if (reverse.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
}

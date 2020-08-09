package chapter06;

public class Exercise06_27 {
	public static void main(String[] args) {
		int count = 0;
		int numberPerLine = 10;
		for (int i = 0; count <= 100; i++) {
			if (isEmirp(i)) {
				System.out.print(i + " ");
				count++;
				if (count % numberPerLine == 0) {
					System.out.println();
				}
			}
		}
	}

	public static boolean isEmirp(int n) {
		if (!isPalindromic(n) && isPrime(n) && isReversePrime(n)) {
			return true;
		}
		return false;
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

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isReversePrime(int n) {
		String str = "" + n;
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse += str.charAt(str.length() - i - 1);
		}
		int rev = Integer.parseInt(reverse);
		if (isPrime(rev)) {
			return true;
		} else {
			return false;
		}
	}

}

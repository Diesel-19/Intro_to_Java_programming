package chapter10.Exercise06;

public class DisplayPrimeNumbers {
	public static void main(String[] args) {
		StackOfIntegers o1 = new StackOfIntegers();
		String s = "";
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				o1.push(i);
			}
		}
		while (!o1.empty()) {
			s += o1.pop() + " ";
		}
		String[] s2 = s.split(" ");
		for (int i = s2.length - 1; 0 <= i; i--) {
			System.out.print(s2[i] + " ");
		}
	}

	public static boolean isPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}

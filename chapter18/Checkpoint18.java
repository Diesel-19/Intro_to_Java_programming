package chapter18;

public class Checkpoint18 {
	public static void main(String[] args) {
		System.out.println(twoPower(5));
		System.out.println(xPower(10, 5));
		System.out.println(sum(10));
	}

	// checkpoint 4
	public static int twoPower(int n) {
		if (n > 0) {
			return 2 * twoPower(n - 1);
		} else {
			return 1;
		}
	}

	// checkpoint 5
	public static int xPower(int x, int n) {
		if (n > 0) {
			return x * xPower(x, n - 1);
		} else {
			return 1;
		}
	}

	// checkpoint 6
	public static int sum(int n) {
		if (n > 0) {
			return n + sum(n - 1);
		} else {
			return 0;
		}
	}
}

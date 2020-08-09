package chapter06;

public class Exercise06_14 {
	public static void main(String[] args) {
		System.out.println("i  \tm(i)");
		System.out.println("--------------");

		for (int i = 1; i < 902; i += 100) {
			System.out.printf("%-3d\t%-6.4f", i, estimatePI(i));
			System.out.println();
		}
	}

	private static double estimatePI(int i) {
		double m = 0;
		for (int k = 1; k <= i; k++) {
			m += 4 * (Math.pow(-1, k + 1) / (2 * k - 1));
		}
		return m;
	}
}

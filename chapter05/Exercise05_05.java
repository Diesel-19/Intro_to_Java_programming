package chapter05;

public class Exercise05_05 {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
		int k1;
		double p1;
		int p2;
		double k2;
		for (k1 = 1, p2 = 20; k1 < 200; k1 += 2, p2 += 5) {
			p1 = k1 * 2.2;
			k2 = p2 / 2.2;
			System.out.printf("%-8d\t%6.1f\t|\t%-6d\t%9.2f\n", k1, p1, p2, k2);
		}
	}

}

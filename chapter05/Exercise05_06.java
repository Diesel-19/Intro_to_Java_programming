package chapter05;

public class Exercise05_06 {
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
		int m1;
		double k1;
		int k2;
		double m2;
		for (m1 = 1, k2 = 20; m1 < 200; m1 += 2, k2 += 5) {
			k1 = m1 * 1.609;
			m2 = k2 / 1.609;
			System.out.printf("%-5d\t%-10.3f\t|\t%-10d\t%-5.3f\n", m1, k1, k2, m2);
		}
	}
}
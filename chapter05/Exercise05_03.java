package chapter05;

public class Exercise05_03 {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");

		for (int k = 1; k < 200; k += 2) {
			double p = k * 2.2;
			System.out.printf("%-9d\t%6.1f\n", k, p);
		}
	}

}

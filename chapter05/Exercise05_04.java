package chapter05;

public class Exercise05_04 {
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers");

		for (int m = 1; m < 11; m++) {
			double k = m * 1.609;
			System.out.printf("%-5d\t%-6.3f\n", m, k);
		}
	}

}

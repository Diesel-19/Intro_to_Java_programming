package chapter06;

public class Exercise06_11 {
	public static void main(String[] args) {
		System.out.println("Sales Amount\tCommision");
		System.out.println("--------------------------");
		for (int i = 10000; i <= 100000; i += 5000) {
			System.out.printf("%-11d\t%10.1f\n", i, computeCommision(i));
		}
	}

	public static double computeCommision(double salesAmount) {
		double commission, balance;
		balance = commission = 0;

		if (salesAmount > 10000)
			commission += (balance = salesAmount - 10000) * 0.12;

		if (salesAmount > 5000)
			commission += (balance -= balance - 5000) * 0.10;

		if (salesAmount > 0)
			commission += balance * 0.08;

		return commission;
	}
}

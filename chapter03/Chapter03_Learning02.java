package chapter03;

public class Chapter03_Learning02 {
	public static void main(String[] args) {
		int k;
		k = (int) (Math.random() * 20); // How do you generate a random integer i such that 0 <= i < 20 ?
		k = 10 + (int) (Math.random() * 10); // How do you generate a random integer i such that 10 <= i < 20?
		k = 10 + (int) (Math.random() * 41); // How do you generate a random integer i such that 10 <= i <= 50
		k = (int) (Math.random() * 2); // Write an expression that returns 0 or 1 randomly.
		// -------------------------------------------------
		int n = 1;
		boolean m;
		m = Math.abs(n - 5) < 4.5;
		System.out.println(m);

		m = Math.abs(n - 5) > 4.5;
		System.out.println(m);
		// -------------------------------------------------
		int a = 2, b = 3, c = 6;
		System.out.println("(x + y < z) is " + (a + b < c));
		// -------------------------------------------------
		int age = 20;
		System.out.println(age > 13 && age < 18);
		// -------------------------------------------------
		int ages = 10;
		int ticketprice = (ages >= 16) ? 20 : 10;
		// -------------------------------------------------
		int x = 0;
		int score = 0;
		int scale = 0;
		if (x > 10) {
			score = 3 * scale;
		} else {
			score = 4 * scale;
		}
		// -------------------------------------------------
		int returnValue = (int)(Math.random() * 2) == 0 ? 1 : -1;
		
	}
}
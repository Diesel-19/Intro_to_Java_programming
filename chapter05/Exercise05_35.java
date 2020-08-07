package chapter05;

public class Exercise05_35 {
	public static void main(String[] args) {
		double n = 0;
		for (int i = 624; i > 0; i--) {
			n += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println(n);
	}
}
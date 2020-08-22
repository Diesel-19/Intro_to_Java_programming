package chapter09.Exercise03;

public class TestDate {
	public static void main(String[] args) {
		java.util.Date d1 = new java.util.Date();
		for (long i = 10000; i <= 1e11; i *= 10) {
			d1.setTime(i);
			System.out.println(d1.toString());
		}
	}
}

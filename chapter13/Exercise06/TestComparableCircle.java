package chapter13.Exercise06;

public class TestComparableCircle {
	public static void main(String[] args) {
		ComparableCircle a = new ComparableCircle(5);
		ComparableCircle b = new ComparableCircle(4);
		System.out.println(a.compareTo(b));
	}
}

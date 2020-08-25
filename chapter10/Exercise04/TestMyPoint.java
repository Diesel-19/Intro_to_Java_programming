package chapter10.Exercise04;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint o1 = new MyPoint();
		MyPoint o2 = new MyPoint(10, 30.5);

		System.out.println(o1.distance(o2));
	}
}

package chapter13.Exercise06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	public ComparableCircle() {
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(ComparableCircle o) {
		if (getArea() < o.getArea()) {
			return -1;
		} else if (getArea() == o.getArea()) {
			return 0;
		} else {
			return 1;
		}
	}

}

package chapter13.Exercise11;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;

	public Octagon() {
		side = 5;
	}

	public Octagon(double side) {
		this.side = side;
	}

	public int compareTo(Octagon o) {
		if (this.getArea() < o.getArea()) {
			return -1;
		} else if (this.getArea() > o.getArea()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public String toString() {
		return "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}

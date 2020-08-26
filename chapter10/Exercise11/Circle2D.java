package chapter10.Exercise11;

public class Circle2D {
	private double x;
	private double y;
	private double radius;

	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(double x, double y) {
		if (Math.sqrt(x * x + y * y) <= radius) {
			return true;
		}
		return false;
	}

	public boolean contains(Circle2D circle) {
		double distanceBetweenCenters = Math
				.sqrt((x - circle.getX()) * (x - circle.getX()) + (y - circle.getY()) * (y - circle.getY()));
		if (distanceBetweenCenters <= radius - circle.getRadius()) {
			return true;
		}
		return false;
	}

	public boolean overlaps(Circle2D circle) {
		double distanceBetweenCenters = Math
				.sqrt((x - circle.getX()) * (x - circle.getX()) + (y - circle.getY()) * (y - circle.getY()));
		if (distanceBetweenCenters <= radius + circle.getRadius()) {
			return true;
		}
		return false;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

}

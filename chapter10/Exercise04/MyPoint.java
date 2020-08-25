package chapter10.Exercise04;

public class MyPoint {
	public double x;
	public double y;

	public MyPoint() {

	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(MyPoint a) {
		return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
	}

	public double distance(double x, double y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
}

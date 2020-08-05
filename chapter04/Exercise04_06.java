package chapter04;

public class Exercise04_06 {
	public static void main(String[] args) {
		double n = Math.toRadians(Math.random() * 360);
		final double RADIUS = 40;

		double x1 = RADIUS * Math.cos(n);
		double y1 = RADIUS * Math.sin(n);

		n = Math.toRadians(Math.random() * 360);

		double x2 = RADIUS * Math.cos(n);
		double y2 = RADIUS * Math.sin(n);

		n = Math.toRadians(Math.random() * 360);

		double x3 = RADIUS * Math.cos(n);
		double y3 = RADIUS * Math.sin(n);

		double d12 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
		double d23 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);
		double d31 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);

		double a = Math.toDegrees(Math.acos((d23 * d23 - d31 * d31 - d12 * d12) / (-2 * d31 * d12)));
		double b = Math.toDegrees(Math.acos((d31 * d31 - d23 * d23 - d12 * d12) / (-2 * d23 * d12)));
		double c = Math.toDegrees(Math.acos((d12 * d12 - d31 * d31 - d23 * d23) / (-2 * d23 * d31)));

		System.out.println(a + " " + b + " " + c);
	}
}

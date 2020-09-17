package chapter13.Exercise12;

public class SumTheAreas {
	public static void main(String[] args) {
		GeometricObject c1 = new Circle(10);
		GeometricObject c2 = new Circle(5);
		GeometricObject r1 = new Rectangle(5, 10);
		GeometricObject r2 = new Rectangle(5, 20);
		GeometricObject[] a = { c1, c2, r1, r2 };
		System.out.println(sumArea(a));
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
}

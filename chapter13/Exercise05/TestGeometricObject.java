package chapter13.Exercise05;

public class TestGeometricObject {
	public static void main(String[] args) {
		GeometricObject a = new Circle(Math.sqrt(10) / Math.sqrt(Math.PI));
		GeometricObject b = new Rectangle(11, 1);
		System.out.println(a.getArea());
		System.out.println(b.getArea());
		System.out.println(a.compareTo(b));
	}
}

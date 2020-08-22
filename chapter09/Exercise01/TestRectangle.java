package chapter09.Exercise01;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);

		System.out.println("Width: " + r1.getWidth() + " Height: " + r1.getHeight() + " Area: " + r1.getArea()
				+ " Perimeter: " + r1.getPerimeter());
		System.out.println("Width: " + r2.getWidth() + " Height: " + r2.getHeight() + " Area: " + r2.getArea()
				+ " Perimeter: " + r2.getPerimeter());

	}
}

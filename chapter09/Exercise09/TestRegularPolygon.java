package chapter09.Exercise09;

public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println("Area: " + r1.getArea() + " Perimeter: " + r1.getPerimeter());
		System.out.println("Area: " + r2.getArea() + " Perimeter: " + r2.getPerimeter());
		System.out.println("Area: " + r3.getArea() + " Perimeter: " + r3.getPerimeter());
	}
}

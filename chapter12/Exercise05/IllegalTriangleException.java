package chapter12.Exercise05;

public class IllegalTriangleException extends RuntimeException {

	public IllegalTriangleException() {
		super("Impossible triangle");
	}
}

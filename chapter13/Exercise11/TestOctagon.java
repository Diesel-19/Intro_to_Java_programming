package chapter13.Exercise11;

public class TestOctagon {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o = new Octagon();
		Octagon a = (Octagon) o.clone();
		
		System.out.println(o.compareTo(a));
	}
}

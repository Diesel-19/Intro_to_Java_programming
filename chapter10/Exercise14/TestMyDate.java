package chapter10.Exercise14;

public class TestMyDate {
	public static void main(String[] args) {
		MyDate o1 = new MyDate();
		MyDate o2 = new MyDate(34355555133101L);

		System.out.println("o1 is: " + o1.getYear() + "-" + o1.getMonth() + "-" + o1.getDay());
		System.out.println("o2 is: " + o2.getYear() + "-" + o2.getMonth() + "-" + o2.getDay());
	}
}

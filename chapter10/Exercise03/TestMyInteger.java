package chapter10.Exercise03;

public class TestMyInteger {
	public static void main(String[] args) {
		System.out.println("first object 5");
		MyInteger a = new MyInteger(5);

		System.out.println("Value");
		System.out.println(a.getValue());
		System.out.println("Even Odd Prime");
		System.out.println(a.isEven());
		System.out.println(a.isOdd());
		System.out.println(a.isPrime());
		System.out.println(MyInteger.isEven(5));
		System.out.println(MyInteger.isOdd(5));
		System.out.println(MyInteger.isPrime(5));
		System.out.println(MyInteger.isEven(a));
		System.out.println(MyInteger.isOdd(a));
		System.out.println(MyInteger.isPrime(a));
		System.out.println("next object 4");
		MyInteger b = new MyInteger(4);
		System.out.println("equals");
		System.out.println(a.equals(b));
		System.out.println(a.equals(4));
		char[] c = { '1', '2' };
		String d = "123";
		System.out.println(MyInteger.parseInt(c));
		System.out.println(MyInteger.parseInt(d));
	}
}

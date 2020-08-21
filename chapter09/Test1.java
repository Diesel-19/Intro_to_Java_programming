package chapter09;

public class Test1 {
	public static void main(String[] args) {
		int[] a = { 1 };
		int[] b = { 2 };
		swap1(a, b);
		System.out.println(a[0]);
		System.out.println(b[0]);
	}

	private static void swap1(int[] a, int[] b) {
		int[] temp = a;
		a = b;
		b = temp;
	}
}

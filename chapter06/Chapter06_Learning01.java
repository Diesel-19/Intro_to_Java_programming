package chapter06;

public class Chapter06_Learning01 {
	public static void main(String[] args) {
		int a = 6, b = 10;
		x(a, b);
	}

	public static int x(int a, int b) {
		int answer = a * b;
		return answer;
	}

	public static void xMethod(double x, double y) {
		System.out.println(x + y);
		return;
	}

	public static int method1(int n, int m) {
		n += m;
		return method2(3.4);
	}

	public static int method2(double n) {
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		else 
			return -1;
	}
}

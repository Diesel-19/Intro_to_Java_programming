package chapter07;

public class Chapter07_Learning01 {
	public static void main(String[] args) {
		double[] a = new double[10];
		a[9] = 5.5;
		System.out.println(a[0] + a[1]);
		double sum = 0;
		for (double e : a) {
			sum += e;
		}
		System.out.println(sum);
		double max;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] >= a[i + 1]) {
				max = a[i + 1];
			}
		}
		double[] b = new double[10];
		for (double k : b) {
			System.out.print(k + " ");
		}
		System.out.println();

		double[] c = { 3.5, 5.5, 4.52, 5.6 };
		
		System.arraycopy(c, 0, b, 0, c.length);
		for (int i = 0; i <b.length; i++) {
			System.out.println(b[i]);
		}
	}
}

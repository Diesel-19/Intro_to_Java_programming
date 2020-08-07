package chapter05;

public class Exercise05_26 {
	public static void main(String[] args) {
		double e = 1;
		double m = 1;
		for (int i = 10000; i <= 100000; i += 10000) {
			for (int k = 0; k < i; k++) {
				m *= (k - 1);
				e += (1 / m);
				
			}
			System.out.println(e);
			
		}
		
	}
}

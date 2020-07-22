package chapter01;

public class Exercise01_12 {
	public static void main(String[] args) {
		int hour = 1;
		int min = 40;
		int sec = 35;

		System.out.println(24.0 * 3600 / ((hour * 3600) + (min * 60) + (sec)) * 1.6);
	}

}

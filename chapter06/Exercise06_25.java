package chapter06;

public class Exercise06_25 {
	public static void main(String[] args) {
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
	}

	public static String convertMillis(long millis) {
		int seconds = (int) (millis / 1000);
		int minutes = (seconds / 60);
		int hours = (minutes / 60);
		String n = hours + ":" + minutes % 60 + ":" + seconds % 60;
		return n;
	}
}

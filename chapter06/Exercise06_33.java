package chapter06;

public class Exercise06_33 {
	public static void main(String[] args) {
		getTime();
	}

	public static void getTime() {
		long millis = System.currentTimeMillis();
		int seconds = (int) (millis / 1000);
		int minutes = seconds / 60;
		int hours = minutes / 60;
		getNumberOfDays(hours);
		System.out.println((hours % 24) + ":" + (minutes % 60) + ":" + (seconds % 60));
	}

	public static long getNumberOfDays(int hours) {
		int days = hours / 24;
		return 2;
		
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

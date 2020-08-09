package chapter06;

public class Exercise06_16 {
	public static void main(String[] args) {
		for (int i = 2000; i <= 2020; i++) {
			System.out.println(numberOfDaysInAYear(i));
		}
	}

	public static int numberOfDaysInAYear(int year) {
		int days = 31 * 7 + 30 * 4;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			days += 29;
		} else {
			days += 28;
		}
		return days;
	}
}

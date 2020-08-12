package chapter06;

public class Exercise06_24 {
	public static void main(String[] args) {

		int seconds = (int) (System.currentTimeMillis() / 1000);
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		int days = hours / 24;
		int remainingHours = hours % 24;
		int year = 1980;
		for (int j = 0; j < 1; j++) {
			for (int i = 1; i < 13; i++) {
				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days -= 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days -= 30;
					break;
				case 2:
					if (isLeapYear(year)) {
						days -= 29;
					} else {
						days -= 28;
					}
				}
			}
			year++;
		}

		System.out.println(remainingHours + ":" + remainingMinutes + ":" + remainingSeconds);
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}

package chapter10.Exercise01;

public class Time {
	long hour;
	long minute;
	long second;

	public Time() {
		setTime(System.currentTimeMillis());
	}

	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	private void setTime(long elapsedTime) {
		long remainingSecond = elapsedTime / 1000;
		second = remainingSecond % 60;
		remainingSecond /= 60;
		minute = remainingSecond % 60;
		remainingSecond /= 60;
		hour = remainingSecond % 24;
	}
}

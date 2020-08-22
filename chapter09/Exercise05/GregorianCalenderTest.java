package chapter09.Exercise05;

import java.util.GregorianCalendar;

public class GregorianCalenderTest {
	public static void main(String[] args) {
		GregorianCalendar s1 = new GregorianCalendar();
		System.out.println(s1.get(GregorianCalendar.YEAR) + "/" + s1.get(GregorianCalendar.MONTH) + "/"
				+ s1.get(GregorianCalendar.DAY_OF_MONTH));

		s1.setTimeInMillis(1234567898765L);

		System.out.println(s1.get(GregorianCalendar.YEAR) + "/" + s1.get(GregorianCalendar.MONTH) + "/"
				+ s1.get(GregorianCalendar.DAY_OF_MONTH));
	}
}

package chapter10.Exercise01;

public class TestTime {
	public static void main(String[] args) {
		Time o1 = new Time();
		Time o2 = new Time(555550000);

		System.out.println(o1.getHour() + ":" + o1.getMinute() + ":" + o1.getSecond());
		System.out.println(o2.getHour() + ":" + o2.getMinute() + ":" + o2.getSecond());
	}
}

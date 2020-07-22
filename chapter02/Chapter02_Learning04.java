package chapter02;

public class Chapter02_Learning04 {
	public static void main(String[] args) {
		//2.12 If today is Tuesday, what will be the day in 100 days
		int remainder = 100 % 7;
		int today = 2 + remainder;
		System.out.println(today);
	}
}

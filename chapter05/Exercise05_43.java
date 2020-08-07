package chapter05;

public class Exercise05_43 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i <= 7/2.; i++) {
			String str = "";
			str += i;
			for (int k = 1; k <= 7; k++) {
				str += " " + k;
				count++;
				System.out.println(str);
				str = "" + i;
			}
		}
		System.out.println(count);
	}
}
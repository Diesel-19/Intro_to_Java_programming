package chapter04;

public class Exercise04_25 {
	public static void main(String[] args) {
		String letter1 = "" + (char) ((int) (Math.random() * 26) + 65);
		String letter2 = "" + (char) ((int) (Math.random() * 26) + 65);
		String letter3 = "" + (char) ((int) (Math.random() * 26) + 65);

		String digit1 = "" + (int) (Math.random() * 10);
		String digit2 = "" + (int) (Math.random() * 10);
		String digit3 = "" + (int) (Math.random() * 10);
		String digit4 = "" + (int) (Math.random() * 10);

		String plate = letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4;
		
		System.out.println(plate);
	}

}

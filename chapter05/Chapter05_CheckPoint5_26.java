package chapter05;

public class Chapter05_CheckPoint5_26 {
	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 20 && sum < 100) {
			number++;
			sum += number;
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);

		System.out.println("--------------------------------");

		int sum1 = 0;
		int number1 = 0;

		while (number1 < 20) {
			number1++;
			if (number1 != 10 && number1 != 11) {
				sum1 += number1;
			}
		}
		System.out.println("The sum is " + sum1);
	}

}

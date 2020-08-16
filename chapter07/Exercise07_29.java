package chapter07;

public class Exercise07_29 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		String[] numbers = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int pick1 = 0;
		int pick2 = 0;
		int pick3 = 0;
		int pick4 = 0;
		while (sum != 24) {
			pick1 = (int) (Math.random() * 13) + 1;
			pick2 = (int) (Math.random() * 13) + 1;
			pick3 = (int) (Math.random() * 13) + 1;
			pick4 = (int) (Math.random() * 13) + 1;
			sum = pick1 + pick2 + pick3 + pick4;
		}
		System.out.println("Picks are:");
		System.out.println(numbers[pick1 - 1]);
		System.out.println(numbers[pick2 - 1]);
		System.out.println(numbers[pick3 - 1]);
		System.out.println(numbers[pick4 - 1]);

	}
}

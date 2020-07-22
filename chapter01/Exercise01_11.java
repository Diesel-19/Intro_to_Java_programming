package chapter01;

public class Exercise01_11 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			int secInYear = 365 * 24 * 60 * 60;
			int birth = (i * secInYear) / 7;
			int death = (i * secInYear) / 13;
			int immigrant = (i * secInYear) / 45;
			int pop = 312032486;
			System.out.println("The population after " + i + " year is: " + (pop + birth + immigrant - death));
		}
	}

}
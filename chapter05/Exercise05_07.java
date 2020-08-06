package chapter05;

public class Exercise05_07 {
	public static void main(String[] args) {
		double tuition = 10_000;
		for (int i = 0; i < 10; i++) {
			tuition += (tuition * 0.05);
		}
		double sum = 0;
		System.out.println("Tenth year's tution is: " + tuition);
		for (int i = 0; i < 4; i++) {
			sum += tuition;
			tuition += (tuition * 0.05);
		}
		System.out.println("Total cost of four years' worth of tuition after the tenth year is: " + sum);
	}

}

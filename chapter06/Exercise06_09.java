package chapter06;

public class Exercise06_09 {
	public static void main(String[] args) {
		double foot = 1;
		double meter = 20;
		System.out.println("Feet\tMeters\t|\tMeters\tFeet");
		System.out.println("-------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%4.1f\t%6.3f\t|\t%4.1f\t%-6.3f",foot,footToMeter(foot),meter,meterToFoot(meter));
			foot++;
			meter += 5;
			System.out.println();
		}
	}

	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}

	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}

package chapter06;

public class Exercise06_08 {
	public static void main(String[] args) {
		double celsius = 40;
		double fahrenheit = 120;
		System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("---------------------------------------------------------");
		for (int i = 40; i > 30; i--) {
			System.out.printf("%-7.1f\t%-9.1f\t|\t%-9.1f\t%-7.2f", celsius, celsiusToFahrenheit(celsius), fahrenheit,
					fahrenheitToCelsius(fahrenheit));
			celsius--;
			fahrenheit -= 10;
			System.out.println();
		}
	}

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9. / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5. / 9) * (fahrenheit - 32);
		return celsius;
	}
}

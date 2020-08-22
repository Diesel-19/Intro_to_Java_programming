package chapter09.Exercise02;

public class TestStock {
	public static void main(String[] args) {
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.setPreviousClosingPrice(34.5);
		s1.setCurrentPrice(34.35);

		System.out.println(s1.getChangePercent());
	}
}

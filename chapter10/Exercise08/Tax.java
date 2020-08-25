package chapter10.Exercise08;

public class Tax {
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;

	public Tax() {

	}

	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {

	}

}

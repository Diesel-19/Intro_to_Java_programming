package chapter04;

import java.util.Scanner;

public class Exercise04_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		String name = input.nextLine();

		System.out.println("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();

		System.out.println("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();

		System.out.println("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();

		System.out.println("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		double grossPay = hours * hourlyPayRate;
		double federalWithholding = federalTaxRate * grossPay;
		double stateWithholding = stateTaxRate * grossPay;
		double total = federalWithholding + stateWithholding;
		double net = grossPay - total;

		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:  ");
		System.out.println("  Federal Withholding (" + (federalTaxRate * 100) + "%): $" + (Math.floor(federalWithholding * 100) / 100.));
		System.out.println("  State Withholding (" + (stateTaxRate * 100) + "%): $" + (Math.floor(stateWithholding * 100) / 100.));
		System.out.println("  Total Deduction: $" + (Math.floor(total * 100) / 100.));
		System.out.println("Net Pay: $" + (Math.floor(net * 100) / 100.));
	}

}

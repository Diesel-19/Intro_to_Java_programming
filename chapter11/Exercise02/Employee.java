package chapter11.Exercise02;

import chapter10.Exercise14.MyDate;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phoneNumber, String emailAddress, String office,
			double salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired.getYear() + "-" + dateHired.getMonth() + "-" + dateHired.getMonth();
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return super.toString() + "\nClass: Employee" + "\nOffice: " + getOffice() + "\nSalary: $" + getSalary()
				+ "\nDate hired: " + getDateHired();
	}
}

package chapter11.Exercise02;

public class Faculty extends Employee {
	private double officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			double officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public double getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nClass: Faculty" + "\nOffice hours: " + getOfficeHours() + "\nRank: " + getRank();
	}
}

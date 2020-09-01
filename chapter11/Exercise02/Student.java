package chapter11.Exercise02;

public class Student extends Person {
	private static final int FRESHMAN = 1;
	private static final int SOPHOMORE = 2;
	private static final int JUNIOR = 3;
	private static final int SENIOR = 4;
	private int classStatus;

	public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}

	public String getStatus() {
		switch (classStatus) {
		case 1:
			return "freshman";
		case 2:
			return "sophomore";
		case 3:
			return "junior";
		case 4:
			return "senior";
		default:
			return "Unknown";
		}
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}

	public String toString() {
		return super.toString() + "\nClass: Student" + "\nStatus: " + getStatus();
	}
}

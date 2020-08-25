package chapter10.Exercise09;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(student, 0, temp, 0, numberOfStudents);
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		int index = -1;
		for (int i = 0; students[i] != null; i++) {
			if (students[i].equals(student)) {
				index = i;
			}
		}
		for (int i = index; i < students.length - 1; i++) {
			students[i] = students[i + 1];
		}
	}

	public void clear() {
		for (int i = 0; i < students.length; i++) {
			students[i] = null;
		}
	}
}

package chapter10.Exercise09;

public class TestCourse {
	public static void main(String[] args) {
		Course o1 = new Course("Test");
		o1.addStudent("bir");
		o1.addStudent("iki");
		o1.addStudent("uc");
		o1.dropStudent("iki");
		String[] students = o1.getStudents();
		for (int i = 0; students[i] != null; i++) {
			System.out.print(students[i] + " ");
		}
	}
}

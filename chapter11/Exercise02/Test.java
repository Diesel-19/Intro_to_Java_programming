package chapter11.Exercise02;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("selim", "Germany", "12345464", "selim@gmail.com");
		Student s = new Student("alex", "France", "4546678", "alex@gmail.com", 2);
		Employee e = new Employee("john", "USA", "454578", "john@gmail.com", "MA", 454646);
		Faculty f = new Faculty("felix", "England", "45456789", "felix@gmail.com", "CA", 7877878, 45, "ceo");
		Staff s1 = new Staff("tim", "Sweden", "014878956", "tim@gmail.com", "SA", 789999, "cto");

		System.out.println(p.toString());
		System.out.println();
		System.out.println(s.toString());
		System.out.println();
		System.out.println(e.toString());
		System.out.println();
		System.out.println(f.toString());
		System.out.println();
		System.out.println(s1.toString());

	}
}

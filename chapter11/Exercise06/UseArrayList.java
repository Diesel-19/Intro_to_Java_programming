package chapter11.Exercise06;

import java.util.ArrayList;
import java.util.Date;

import chapter09.Circle;
import chapter10.Loan;

public class UseArrayList {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		Loan l = new Loan();
		Date d = new Date();
		String s = new String();
		Circle c = new Circle();

		list.add(l);
		list.add(d);
		list.add(s);
		list.add(c);

		for (Object object : list) {
			System.out.println(object.toString());
		}
	}
}

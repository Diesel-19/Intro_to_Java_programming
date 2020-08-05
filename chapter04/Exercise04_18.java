package chapter04;

import java.util.Scanner;

public class Exercise04_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two characters: ");
		String majorStatus = input.next();

		char major = majorStatus.toUpperCase().charAt(0);
		char status = majorStatus.charAt(1);

		String m = "";
		String s = "";
		switch (major) {
		case 'M':
			m = "Mathematics";
			break;
		case 'C':
			m = "Computer Science";
			break;
		case 'I':
			m = "Information Technology";
			break;
		default:
			System.err.println("Wrong input");
			System.exit(0);
		}
		switch (status) {
		case '1':
			s = "Freshman";
			break;
		case '2':
			s = "Sophomore";
			break;
		case '3':
			s = "Junior";
			break;
		case '4':
			s = "Senior";
			break;
		default:
			System.err.println("Wrong input");
			System.exit(0);
		}
		System.out.println(m + " " + s);
	}

}

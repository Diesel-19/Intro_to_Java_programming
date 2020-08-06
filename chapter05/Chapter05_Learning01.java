package chapter05;

public class Chapter05_Learning01 {
	public static void main(String[] args) {
		/*
		for (int i = 1, sum = 0; sum < 10000; i++) {
			sum = sum + i;
		}
		int i = 0;
		while (i < 5) {
			for (int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;
		}
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
		*/
		int i = 1;
		do {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");
				num += 2;
			}
			System.out.println();
			i++;
		} while (i <= 5);
	}
}

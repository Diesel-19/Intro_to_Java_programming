package chapter09.Exercise04;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random random1 = new Random(1000);
		System.out.println(random1.nextInt(100));
	}
}

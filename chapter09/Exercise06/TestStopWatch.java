package chapter09.Exercise06;

public class TestStopWatch {
	public static void main(String[] args) {
		int[] array = new int[100000];
		for (int i = 0; i < args.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}
		StopWatch time = new StopWatch();
		java.util.Arrays.sort(array);
		time.stop();
		System.out.println(time.getElapsedTime());
	}
}

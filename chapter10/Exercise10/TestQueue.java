package chapter10.Exercise10;

public class TestQueue {
	public static void main(String[] args) {
		Queue o1 = new Queue();

		for (int i = 0; i < 20; i++) {
			o1.enqueue(i + 1);
		}
		for (int i = 0; !o1.empty(); i++) {
			System.out.print(o1.dequeue() + " ");
		}
	}
}

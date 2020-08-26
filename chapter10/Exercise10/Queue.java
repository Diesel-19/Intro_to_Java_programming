package chapter10.Exercise10;

public class Queue {
	private int[] elements;
	private int size;
	private static int defaultCapacity;

	public Queue() {
		defaultCapacity = 8;
		elements = new int[defaultCapacity];
	}

	public void enqueue(int v) {
		if (size == elements.length) {
			int[] temp = new int[size * 2];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int firstElement = elements[0];
		for (int i = 0; i < size; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return firstElement;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}

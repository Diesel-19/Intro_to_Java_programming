package chapter10.Exercise27;

public class MyStringBuilder1 {
	private String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		String str = this.s + s.toString();
		return new MyStringBuilder1(str);
	}

	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.s + i);
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (64 < s.charAt(i) && s.charAt(i) < 91) {
				str += (char) (s.charAt(i) + 32);
			} else {
				str += s.charAt(i);
			}
		}
		return new MyStringBuilder1(str);
	}

	public MyStringBuilder1 substring(int begin, int end) {
		String str = "";
		for (int i = begin; i < end; i++) {
			str += s.charAt(i);
		}
		return new MyStringBuilder1(str);
	}

	public String toString() {
		return s;
	}
}

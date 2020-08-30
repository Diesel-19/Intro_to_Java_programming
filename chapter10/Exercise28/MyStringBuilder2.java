package chapter10.Exercise28;

public class MyStringBuilder2 {
	private String s;

	public MyStringBuilder2() {

	}

	public MyStringBuilder2(char[] chars) {
		this.s = String.valueOf(chars);
	}

	public MyStringBuilder2(String s) {
		this.s = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String str = "";
		for (int i = 0; i < this.s.length(); i++) {
			if (i == offset) {
				str += s.toString();
			} else {
				str += this.s.charAt(i);
			}
		}
		return new MyStringBuilder2(str);
	}

	public MyStringBuilder2 reverse() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str += s.charAt(s.length() - 1 - i);
		}
		return new MyStringBuilder2(str);
	}

	public MyStringBuilder2 substring(int begin) {
		String str = "";
		for (int i = begin; i < s.length(); i++) {
			str += s.charAt(i);
		}
		return new MyStringBuilder2(str);
	}

	public MyStringBuilder2 toUpperCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (96 < s.charAt(i) && s.charAt(i) < 123) {
				str += (char) (s.charAt(i) - 32);
			} else {
				str += s.charAt(i);
			}
		}
		return new MyStringBuilder2(str);
	}

	public String toString() {
		return s;
	}
}

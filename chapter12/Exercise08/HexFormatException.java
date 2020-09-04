package chapter12.Exercise08;

public class HexFormatException extends RuntimeException{
	public HexFormatException() {
		super("Not a hex value");
	}
}

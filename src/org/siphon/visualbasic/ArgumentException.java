package org.siphon.visualbasic;

public class ArgumentException extends Exception {

	private int argumetIndex;

	public int getArgumetIndex() {
		return argumetIndex;
	}

	public ArgumentException(int argumetIndex, Throwable cause) {
		super(cause);
		this.argumetIndex = argumetIndex;
	}

}

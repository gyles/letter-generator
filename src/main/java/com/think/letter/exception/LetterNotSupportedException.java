package com.think.letter.exception;

public class LetterNotSupportedException extends LetterException {
	
	private static final long serialVersionUID = 1L;
	
	public LetterNotSupportedException() {
		super("Letter not supported");
	}

}

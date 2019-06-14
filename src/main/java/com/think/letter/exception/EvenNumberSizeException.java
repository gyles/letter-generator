package com.think.letter.exception;

public class EvenNumberSizeException extends LetterException {

	private static final long serialVersionUID = 1L;
	
	public EvenNumberSizeException() {
		super("Only odd numbers allowed");
	}

}

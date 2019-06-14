package com.think.letter.resource;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LetterResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final int MAX_LETTERS_LENGTH = 10;
	
	private static final int MIN_LETTERS_SIZE = 3;
	
	private static final int MAX_LETTERS_SIZE = 21;
	
	@NotNull
	@Size(max = MAX_LETTERS_LENGTH)
	private String letters;
	
	@NotNull
	@Min(MIN_LETTERS_SIZE)
	@Max(MAX_LETTERS_SIZE)
	private Integer size;

	public String getLetters() {
		return letters;
	}

	public void setLetters(String letters) {
		this.letters = letters;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}

package com.think.letter.service.impl.chain;

import java.util.Arrays;

import com.think.letter.domain.Letter;
import com.think.letter.exception.LetterNotSupportedException;

public abstract class LetterChain {
	
	private LetterChain next;
	
	public abstract Character getCharacter();
	
	public abstract Letter generateLetter(Integer size);
	
	public LetterChain getNext() {
		return next;
	}

	public LetterChain setNext(LetterChain next) {
		this.next = next;
		
		return next;
	}
	
	public Letter generateLetter(Character character, Integer size) throws LetterNotSupportedException {
		Letter letter = null;
		if (this.getCharacter().equals(character)) {
			letter = this.generateLetter(size);
		} else if (getNext() != null) {
			letter = getNext().generateLetter(character, size);
		} else {
			throw new LetterNotSupportedException();
		}
		
		return letter;
	}
	
	protected char[] newLine(final Integer size) {
		char[] line = new char[size];
		Arrays.fill(line, ' ');
		
		return line;
	}
	
	protected Integer getMedian(final Integer size) {
		return size / 2 + 1;
	}

}

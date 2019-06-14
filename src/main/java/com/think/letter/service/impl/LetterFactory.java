package com.think.letter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.think.letter.domain.Letter;
import com.think.letter.exception.EvenNumberSizeException;
import com.think.letter.exception.LetterException;
import com.think.letter.service.impl.chain.LetterX;

@Component
public class LetterFactory {
	
	@Autowired
	private LetterX start;
	
	public Letter generateLetter(Character character, Integer size) throws LetterException {
		if (size % 2 == 0) {
			throw new EvenNumberSizeException();
		}
		
		return start.generateLetter(character, size);
	}

}

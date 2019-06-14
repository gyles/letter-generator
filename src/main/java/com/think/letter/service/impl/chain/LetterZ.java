package com.think.letter.service.impl.chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.think.letter.config.ApplicationProperties;
import com.think.letter.domain.Letter;

@Component
public class LetterZ extends LetterChain {
	
	@Autowired
	private ApplicationProperties properties;

	@Override
	public Character getCharacter() {
		return 'z';
	}

	@Override
	public Letter generateLetter(Integer size) {
		Collection<String> representation = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			char[] line = newLine(size);
			line[size - i - 1] = properties.getFillCharacter();
			if (i == 0 || i == size - 1) {
				Arrays.fill(line, properties.getFillCharacter());
			}
			
			representation.add(new String(line));
		}
		
		return new Letter(this.getCharacter(), representation);
	}

}

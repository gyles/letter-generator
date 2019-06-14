package com.think.letter.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.letter.config.ApplicationProperties;
import com.think.letter.domain.Letter;
import com.think.letter.exception.LetterException;
import com.think.letter.service.LetterService;

@Service
public class LetterServiceImpl implements LetterService {
	
	private final LetterFactory letterFactory;
	
	public LetterServiceImpl(final LetterFactory letterFactory) {
		this.letterFactory = letterFactory;
	}

	@Override
	public Collection<Letter> generateLetters(String input, int size) throws LetterException {
		Collection<Letter> letters = new ArrayList<>();
		input.toLowerCase().chars().forEach(letter -> letters.add(letterFactory.generateLetter((char) letter, size)));

		return letters;
	}

}
